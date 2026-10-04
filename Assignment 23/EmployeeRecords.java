import java.sql.*;

public class EmployeeRecords {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "select employee_id, name, department, salary from employees"
            );

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