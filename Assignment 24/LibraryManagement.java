import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class LibraryManagement extends JFrame {
    JTextField bookId, bookName, author, quantity;
    JTable table;
    DefaultTableModel model;

    public LibraryManagement() {
        setTitle("Library Management System");
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Book ID"));
        bookId = new JTextField();
        panel.add(bookId);

        panel.add(new JLabel("Book Name"));
        bookName = new JTextField();
        panel.add(bookName);

        panel.add(new JLabel("Author"));
        author = new JTextField();
        panel.add(author);

        panel.add(new JLabel("Quantity"));
        quantity = new JTextField();
        panel.add(quantity);

        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");

        panel.add(add);
        panel.add(delete);

        add(panel, BorderLayout.NORTH);

        model = new DefaultTableModel(
            new String[]{"Book ID", "Book Name", "Author", "Quantity"}, 0
        );

        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        add.addActionListener(e -> addBook());
        delete.addActionListener(e -> deleteBook());

        displayBooks();

        setVisible(true);
    }

    void addBook() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            PreparedStatement ps = con.prepareStatement(
                "insert into library values(?,?,?,?)"
            );

            ps.setInt(1, Integer.parseInt(bookId.getText()));
            ps.setString(2, bookName.getText());
            ps.setString(3, author.getText());
            ps.setInt(4, Integer.parseInt(quantity.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Book added successfully");

            con.close();
            displayBooks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void deleteBook() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            PreparedStatement ps = con.prepareStatement(
                "delete from library where book_id=?"
            );

            ps.setInt(1, Integer.parseInt(bookId.getText()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Book deleted successfully");

            con.close();
            displayBooks();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void displayBooks() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from library");

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("book_id"),
                    rs.getString("book_name"),
                    rs.getString("author"),
                    rs.getInt("quantity")
                });
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new LibraryManagement();
    }
}
