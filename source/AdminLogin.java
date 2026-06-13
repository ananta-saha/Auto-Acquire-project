package source;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton backButton;
    private JLabel background;

    public AdminLogin() {
        setTitle("Admin Login");
        setSize(1200, 710);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/admin.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 710);
        setContentPane(background);
        background.setLayout(null);

        JLabel titleLabel = new JLabel("Admin Login");
        titleLabel.setFont(new Font("Aharoni", Font.BOLD, 25));
        titleLabel.setForeground(Color.red);
        titleLabel.setBounds(855, 120, 300, 35);
        background.add(titleLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(730, 200, 150, 30);
        usernameLabel.setFont(new Font("Aharoni", Font.BOLD, 15));
        background.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(830, 200, 200, 30);
        background.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(730, 250, 80, 30);
        passwordLabel.setFont(new Font("Aharoni", Font.BOLD, 15));
        background.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(830, 250, 200, 30);
        background.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(880, 310, 100, 30);
        loginButton.addActionListener(this);
        background.add(loginButton);

        backButton = new JButton("<");
        backButton.setFont(new Font("Aharoni", Font.BOLD, 20));
        backButton.setBounds(30, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                UserData userDataPage = new UserData(); // Assuming UserData is another JFrame
                userDataPage.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
            }
        } else if (ae.getSource() == backButton) {
            Home home = new Home(); // Assuming Home is another JFrame
            home.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminLogin().setVisible(true));
    }
}
