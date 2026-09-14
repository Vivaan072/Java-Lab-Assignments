import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration extends JFrame implements ActionListener {

    JTextField idField, nameField, deptField, salaryField;
    JButton submitButton;

    EmployeeRegistration() {

        setTitle("Employee Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Employee Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");

        idField = new JTextField();
        nameField = new JTextField();
        deptField = new JTextField();
        salaryField = new JTextField();

        submitButton = new JButton("Submit");

        add(idLabel);
        add(idField);

        add(nameLabel);
        add(nameField);

        add(deptLabel);
        add(deptField);

        add(salaryLabel);
        add(salaryField);

        add(new JLabel(""));
        add(submitButton);

        submitButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String id = idField.getText();
        String name = nameField.getText();
        String department = deptField.getText();
        String salary = salaryField.getText();

        JOptionPane.showMessageDialog(
            this,
            "Employee ID: " + id +
            "\nEmployee Name: " + name +
            "\nDepartment: " + department +
            "\nSalary: " + salary
        );
    }

    public static void main(String[] args) {
        new EmployeeRegistration();
    }
}