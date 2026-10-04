import java.sql.*;

public class ProductDetails {
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
                "select product_id, product_name, quantity, price from products"
            );

            while (rs.next()) {
                System.out.println(
                    rs.getInt("product_id") + " " +
                    rs.getString("product_name") + " " +
                    rs.getInt("quantity") + " " +
                    rs.getDouble("price")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}