import java.sql.*;

public class DisplayRecords {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from records");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}