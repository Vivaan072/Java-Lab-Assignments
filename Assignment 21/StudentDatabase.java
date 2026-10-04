import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            System.out.println("Student database connected successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
