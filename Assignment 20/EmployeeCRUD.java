import java.sql.*;

public class EmployeeCRUD {
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
                "insert into employees values (105,'Rohan','it',65000)"
            );

            System.out.println("After Insert:");

            ResultSet rs = stmt.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("employee_id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("department") + " " +
                    rs.getDouble("salary")
                );
            }

            stmt.executeUpdate(
                "update employees set salary=70000 where employee_id=105"
            );

            System.out.println("\nAfter Update:");

            rs = stmt.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("employee_id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("department") + " " +
                    rs.getDouble("salary")
                );
            }

            stmt.executeUpdate(
                "delete from employees where employee_id=105"
            );

            System.out.println("\nAfter Delete:");

            rs = stmt.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("employee_id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("department") + " " +
                    rs.getDouble("salary")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
