import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            System.out.println("Database connected successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}