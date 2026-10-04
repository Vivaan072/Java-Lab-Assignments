import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class BookIssueTracking extends JFrame {
    JTextField bookId, studentName, issueDate, returnDate;
    JTable table;
    DefaultTableModel model;

    public BookIssueTracking() {
        setTitle("Book Issue Tracking System");
        setSize(800, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Book ID"));
        bookId = new JTextField();
        panel.add(bookId);

        panel.add(new JLabel("Student Name"));
        studentName = new JTextField();
        panel.add(studentName);

        panel.add(new JLabel("Issue Date"));
        issueDate = new JTextField();
        panel.add(issueDate);

        panel.add(new JLabel("Return Date"));
        returnDate = new JTextField();
        panel.add(returnDate);

        JButton add = new JButton("Add");
        JButton delete = new JButton("Delete");

        panel.add(add);
        panel.add(delete);

        add(panel, BorderLayout.NORTH);

        model = new DefaultTableModel(
            new String[]{"Book ID", "Student Name", "Issue Date", "Return Date"}, 0
        );

        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        add.addActionListener(e -> addRecord());
        delete.addActionListener(e -> deleteRecord());

        displayRecords();

        setVisible(true);
    }

    void addRecord() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            PreparedStatement ps = con.prepareStatement(
                "insert into book_issue values(?,?,?,?)"
            );

            ps.setInt(1, Integer.parseInt(bookId.getText()));
            ps.setString(2, studentName.getText());
            ps.setDate(3, Date.valueOf(issueDate.getText()));
            ps.setDate(4, Date.valueOf(returnDate.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this,
                "Book issue record added successfully"
            );

            con.close();
            displayRecords();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void deleteRecord() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            PreparedStatement ps = con.prepareStatement(
                "delete from book_issue where book_id=? and student_name=?"
            );

            ps.setInt(1, Integer.parseInt(bookId.getText()));
            ps.setString(2, studentName.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this,
                "Book issue record deleted successfully"
            );

            con.close();
            displayRecords();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void displayRecords() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collegeDB",
                "root",
                "vivaan@123"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from book_issue");

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("book_id"),
                    rs.getString("student_name"),
                    rs.getDate("issue_date"),
                    rs.getDate("return_date")
                });
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new BookIssueTracking();
    }
}