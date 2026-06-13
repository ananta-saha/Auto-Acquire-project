package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class AboutUsPage extends JFrame {
    JButton backButton;

    public AboutUsPage() {
        super("ABOUT US");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/about.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1200, 750);
        panel.add(backgroundLabel);

        String paragraph = "<html><b><font color='#FD1C03'>AUTO CLUB</font></b><b><font color='white'> is dedicated to providing exceptional car buying experiences . With a focus on customer satisfaction, we offer a wide range of high-quality <br>vehicles to suit every need and budget.<br> <br>Our team of experts is committed to guiding you through every step of the car acquisition process, ensuring transparency and reliability.<br> <br><b><font color='white'>At <b><font color='red'>AUTO CLUB</font></b>, we strive to exceed expectations, making your dream car a reality</font></b></html>";

        JLabel label = new JLabel(paragraph);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setBounds(30, 50, 650, 300);
        backgroundLabel.add(label);

        backButton = new JButton("←");
        backButton.setFont(new Font("Aharoni", Font.BOLD, 25));
        backButton.setForeground(Color.black);
        backButton.setBounds(20, 20, 70, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home mainForm = new Home();
                mainForm.setVisible(true);
            }
        });
        backgroundLabel.add(backButton);

        this.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AboutUsPage aboutUsPage = new AboutUsPage();
            aboutUsPage.setVisible(true);
        });
    }
}
