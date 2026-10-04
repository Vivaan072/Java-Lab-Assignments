import java.sql.*;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "select * from login where username=? and password=?"
            );

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid username or password");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}