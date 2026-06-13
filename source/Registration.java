package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Registration extends JFrame implements ActionListener {

    JLabel titleLabel, usernameLabel, emailLabel, phoneLabel, passwordLabel, confirmPasswordLabel, messageLabel;
    JTextField usernameField, emailField, phoneField;
    JPasswordField passwordField, confirmPasswordField;
    JButton registerButton, backButton;
    JCheckBox showPasswordCheckbox;
    ImageIcon backgroundImage;

    public Registration() {
        super("Registration");
        this.setSize(1200, 710);
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Background Image
        backgroundImage = new ImageIcon("C:\\Users\\Genius core\\Documents\\JAVAPROJECT\\src\\ALL IMAGES\\WhatsApp Image 2024-05-13 at 01.27.45_d172382c.jpg"); // Change "background.jpg" to your image file path
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750);
        this.add(background); // Set background image as content pane

        // Title
        titleLabel = new JLabel("User Registration");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(800, 100, 250, 35);
        background.add(titleLabel);

        // Username
        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        usernameLabel.setForeground(Color.black);
        usernameLabel.setBounds(640, 170, 100, 20);
        background.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Serif", Font.PLAIN, 20));
        usernameField.setBounds(820, 170, 200, 30);
        background.add(usernameField);

        // Email
        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        emailLabel.setForeground(Color.black);
        emailLabel.setBounds(640, 210, 100, 20);
        background.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Serif", Font.PLAIN, 20));
        emailField.setBounds(820, 210, 200, 30);
        background.add(emailField);

        // Phone Number
        phoneLabel = new JLabel("Phone:");
        phoneLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        phoneLabel.setForeground(Color.black);
        phoneLabel.setBounds(640, 250, 100, 20);
        background.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setFont(new Font("Serif", Font.PLAIN, 20));
        phoneField.setBounds(820, 250, 200, 30);
        background.add(phoneField);

        // Password
        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        passwordLabel.setForeground(Color.black);
        passwordLabel.setBounds(640, 290, 100, 20);
        background.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Serif", Font.PLAIN, 20));
        passwordField.setBounds(820, 290, 200, 30);
        background.add(passwordField);

        // Confirm Password
        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmPasswordLabel.setForeground(Color.black);
        confirmPasswordLabel.setBounds(640, 330, 180, 20);
        background.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Serif", Font.PLAIN, 20));
        confirmPasswordField.setBounds(820, 330, 200, 30);
        background.add(confirmPasswordField);

        // Show Password Checkbox
        showPasswordCheckbox = new JCheckBox("Show Password");
        showPasswordCheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        showPasswordCheckbox.setForeground(Color.black);
        showPasswordCheckbox.setBounds(820, 360, 200, 20);
        showPasswordCheckbox.addActionListener(this);
        background.add(showPasswordCheckbox);

        // Register button
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Serif", Font.BOLD, 20));
        registerButton.setForeground(Color.white);
        registerButton.setBackground(new Color(102, 140, 208));
        registerButton.setBounds(820, 410, 200, 30);
        registerButton.addActionListener(this);
        background.add(registerButton);

        // Back button
        backButton = new JButton("←");
        backButton.setFont(new Font("Serif", Font.BOLD, 15));
        backButton.setForeground(Color.black);
        backButton.setBounds(20, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);

        // Message Label
        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        messageLabel.setForeground(Color.red);
        messageLabel.setBounds(820, 460, 220, 20);
        background.add(messageLabel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == showPasswordCheckbox) {
            // Toggle password visibility
            if (showPasswordCheckbox.isSelected()) {
                passwordField.setEchoChar((char) 0);
                confirmPasswordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
                confirmPasswordField.setEchoChar('*');
            }
        }
        // Perform registration logic when the register button is clicked
        if (ae.getSource() == registerButton) {
            // Check if all fields are filled
            if (usernameField.getText().isEmpty() || emailField.getText().isEmpty() || phoneField.getText().isEmpty() ||
                    passwordField.getPassword().length == 0 || confirmPasswordField.getPassword().length == 0) {
                messageLabel.setText("Please complete all details.");
            } else {
                // Check if passwords match
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                if (!password.equals(confirmPassword)) {
                    messageLabel.setText("The passwords do not match");
                } else {
                    messageLabel.setText(""); // Clear any previous message
                    // Proceed with registration logic
                    // Save user details to file
                    saveUserDetailsToFile();
                    // Assuming registration is successful, display success message
                    displaySuccessMessage();
                    // Redirect to login page
                    redirectToLogin();
                }
            }
        }
        else if(ae.getSource() == backButton){
            Login p=new Login();
            this.setVisible(false);
            p.setVisible(true);
            this.dispose();
        }
    }

    private void saveUserDetailsToFile() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String password = new String(passwordField.getPassword());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JAVAPROJECT\\src\\Data\\user_data.txt", true))) {
            writer.write("Username: " + username);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("Phone: " + phone);
            writer.newLine();
            writer.write("Password: " + password);
            writer.newLine();
            writer.write("-------------------------------------------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displaySuccessMessage() {
        JFrame successFrame = new JFrame("Register");
        successFrame.setSize(400, 200);
        successFrame.setResizable(false);
        successFrame.setLocationRelativeTo(null);
        successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel successPanel = new JPanel();
        successPanel.setLayout(new BorderLayout());

        JLabel successLabel = new JLabel("ACCOUNT CREATED SUCCESSFULLY !");
        successLabel.setFont(new Font("Serif", Font.BOLD, 16));
        successLabel.setForeground(Color.green);
        successLabel.setHorizontalAlignment(SwingConstants.CENTER);
        successPanel.add(successLabel, BorderLayout.CENTER);

        successFrame.add(successPanel);
        successFrame.setVisible(false);

        this.dispose();
    }

    private void redirectToLogin() {
        setVisible(false); // Hide the registration frame
        Login login = new Login(); // Create login frame
        login.setVisible(true); // Show login frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
}
