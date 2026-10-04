import java.sql.*;

public class StudentCRUD {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                "insert into student_details values (5,'Rahul','cse',88)"
            );

            System.out.println("After Insert:");

            ResultSet rs = stmt.executeQuery("select * from student_details");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course") + " " +
                    rs.getDouble("marks")
                );
            }

            stmt.executeUpdate(
                "update student_details set marks=92 where roll_no=5"
            );

            System.out.println("\nAfter Update:");

            rs = stmt.executeQuery("select * from student_details");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course") + " " +
                    rs.getDouble("marks")
                );
            }

            stmt.executeUpdate(
                "delete from student_details where roll_no=5"
            );

            System.out.println("\nAfter Delete:");

            rs = stmt.executeQuery("select * from student_details");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course") + " " +
                    rs.getDouble("marks")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}