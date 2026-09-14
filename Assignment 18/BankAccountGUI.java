import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankAccountGUI extends JFrame implements ActionListener {

    JTextField balanceField, amountField, resultField;
    JButton deposit, withdraw;

    BankAccountGUI() {

        setTitle("Bank Account");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel l1 = new JLabel("Initial Balance:");
        JLabel l2 = new JLabel("Transaction Amount:");
        JLabel l3 = new JLabel("Updated Balance:");

        balanceField = new JTextField();
        amountField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        add(l1);
        add(balanceField);

        add(l2);
        add(amountField);

        add(l3);
        add(resultField);

        add(deposit);
        add(withdraw);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double balance = Double.parseDouble(balanceField.getText());
        double amount = Double.parseDouble(amountField.getText());

        if (e.getSource() == deposit) {
            balance = balance + amount;
        } 
        else if (e.getSource() == withdraw) {
            balance = balance - amount;
        }

        resultField.setText(String.valueOf(balance));
    }

    public static void main(String[] args) {
        new BankAccountGUI();
    }
}