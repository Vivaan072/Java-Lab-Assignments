import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField nameField, rollField, courseField;
    JButton submitButton;

    StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel("Student Name:");
        JLabel rollLabel = new JLabel("Roll Number:");
        JLabel courseLabel = new JLabel("Course:");

        nameField = new JTextField();
        rollField = new JTextField();
        courseField = new JTextField();

        submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameField);

        add(rollLabel);
        add(rollField);

        add(courseLabel);
        add(courseField);

        add(new JLabel(""));
        add(submitButton);

        submitButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String roll = rollField.getText();
        String course = courseField.getText();

        JOptionPane.showMessageDialog(
            this,
            "Student Name: " + name +
            "\nRoll Number: " + roll +
            "\nCourse: " + course
        );
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}