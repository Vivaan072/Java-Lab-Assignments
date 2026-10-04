import java.sql.*;
import java.util.Scanner;

public class HospitalLogin {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter login ID: ");
            String loginId = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "select role from hospital_staff where login_id=? and password=?"
            );

            ps.setString(1, loginId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");

                if (role.equals("doctor")) {
                    System.out.println("Doctor login successful");
                    System.out.println("Doctor access granted");
                } else if (role.equals("nurse")) {
                    System.out.println("Nurse login successful");
                    System.out.println("Nurse access granted");
                }
            } else {
                System.out.println("Invalid login ID or password");
                System.out.println("Access denied");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}