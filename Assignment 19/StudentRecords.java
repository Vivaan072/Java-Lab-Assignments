import java.sql.*;

public class StudentRecords {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from students");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("dept")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} 