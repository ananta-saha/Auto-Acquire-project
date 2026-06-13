package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1;
    JButton b1, b2, backButton;
    JPasswordField pa1;
    JPanel p2;
    JCheckBox c1;

    public Login() {
        super("Login");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p2 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/login.jpg"));
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        p2.setLayout(null);

        l1 = new JLabel("Don't have an account?");
        l1.setFont(new Font("Serif", Font.PLAIN, 20));
        l1.setForeground(Color.black);
        l1.setBounds(850, 30, 300, 15);
        p2.add(l1);

        l2 = new JLabel("Account Login");
        l2.setFont(new Font("Serif", Font.PLAIN, 24));
        l2.setForeground(Color.red);
        l2.setBounds(825, 130, 300, 28);
        p2.add(l2);

        l3 = new JLabel("Username");
        l3.setFont(new Font("Serif", Font.PLAIN, 20));
        l3.setForeground(Color.black);
        l3.setBounds(750, 180, 100, 20);
        p2.add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Serif", Font.PLAIN, 20));
        t1.setBounds(750, 210, 300, 30);
        p2.add(t1);

        l4 = new JLabel("Password");
        l4.setFont(new Font("Serif", Font.PLAIN, 18));
        l4.setForeground(Color.black);
        l4.setBounds(750, 255, 100, 20);
        p2.add(l4);

        pa1 = new JPasswordField();
        pa1.setEchoChar('*');
        pa1.setFont(new Font("Serif", Font.PLAIN, 19));
        pa1.setBounds(750, 280, 300, 30);
        p2.add(pa1);

        b1 = new JButton("Register");
        b1.setFont(new Font("Serif", Font.BOLD, 20));
        b1.setForeground(Color.red);
        b1.setBackground(new Color(240, 240, 240));
        b1.setBorder(null);
        b1.setBounds(1050, 27, 100, 25);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Login");
        b2.setFont(new Font("Serif", Font.BOLD, 22));
        b2.setForeground(Color.white);
        b2.setBackground(new Color(102, 140, 208));
        b2.setBounds(750, 380, 300, 40);
        b2.addActionListener(this);
        p2.add(b2);

        c1 = new JCheckBox("Show password");
        c1.setFont(new Font("Serif", Font.PLAIN, 16));
        c1.setForeground(Color.black);
        c1.setBackground(new Color(240, 240, 240));
        c1.setBounds(750, 315, 300, 40);
        c1.addActionListener(this);
        p2.add(c1);

        backButton = new JButton("<");
        backButton.setFont(new Font("Aharoni", Font.BOLD, 20));
        backButton.setForeground(Color.black);
        backButton.setBounds(20, 20, 70, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home mainForm = new Home();
                mainForm.setVisible(true);
            }
        });
        p2.add(backButton);

        this.add(p2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == c1) {
            if (c1.isSelected()) {
                pa1.setEchoChar((char) 0);
            } else {
                pa1.setEchoChar('*');
            }
        }
        if (ae.getSource() == b1) {
            Registration r = new Registration();
            this.setVisible(false);
            r.setVisible(true);
        }
        if (ae.getSource() == b2) {
            if (verifyLogin(t1.getText(), new String(pa1.getPassword()))) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                this.setVisible(false);
                payment userDashboard = new payment();
                userDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        }
    }

    private boolean verifyLogin(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVAPROJECT\\src\\Data\\user_data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Username: " + username)) {
                    String storedPassword = null;
                    while ((line = reader.readLine()) != null && !line.startsWith("-------------------------------------------------")) {
                        if (line.startsWith("Password: ")) {
                            storedPassword = line.substring("Password: ".length());
                        }
                    }
                    return storedPassword != null && storedPassword.equals(password);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
