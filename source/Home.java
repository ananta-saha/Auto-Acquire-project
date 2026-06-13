package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b7,b8;
    JPanel p1;

    public Home() {
        super("AUTO ACQUIRE");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/home.jpg"));
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);

                g.setColor(Color.RED);
                g.setFont(new Font("Arial", Font.BOLD, 40));
                g.drawString("AuToCluB", 43, 56);

                g.setColor(Color.black);
                g.setFont(new Font("Arial", Font.BOLD, 30));
                g.drawString("Buy Your", 75, 175);

                g.setColor(Color.black);
                g.setFont(new Font("Arial", Font.BOLD, 45));
                g.drawString("Dream Car", 45, 220);

                String paragraph = "<html> Live The Life Of Luxury.<br>Just Buy A Car Of Your Wish From Our Vast Collection.<br>Enjoy Every Moment With Your Family.<br>Join Us To Make This Family Vast.</html>";
                JLabel label1 = new JLabel(paragraph);
                label1.setFont(new Font("Arial", Font.PLAIN, 18));
                label1.setBounds(50, 140, 650, 300);
                label1.setForeground(Color.decode("#000000"));
                p1.add(label1);

            }
        };

        p1.setLayout(null);

        b1 = new JButton("HOME");
        b1.setFont(new Font("Aharoni", Font.BOLD, 13));
        b1.setForeground(Color.black);
        b1.setBorderPainted(false); 
        b1.setContentAreaFilled(false); 
        b1.setFocusPainted(false); 
        b1.setBounds(450, 30, 90, 25);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("ABOUT US");
        b2.setFont(new Font("Aharoni", Font.BOLD, 13));
        b2.setForeground(Color.black);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setBounds(545, 30, 110, 25);
        b2.addActionListener(this);
        p1.add(b2);

        b3 = new JButton("CAR LISTING");
        b3.setFont(new Font("Aharoni", Font.BOLD, 13));
        b3.setForeground(Color.black);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setBounds(655, 30, 130, 25);
        b3.addActionListener(this);
        p1.add(b3);

        b4 = new JButton("FAQS");
        b4.setFont(new Font("Aharoni", Font.BOLD, 13));
        b4.setForeground(Color.black);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setBounds(785, 30, 80, 25);
        b4.addActionListener(this);
        p1.add(b4);

        b5 = new JButton("CONTACT US");
        b5.setFont(new Font("Aharoni", Font.BOLD, 13));
        b5.setForeground(Color.black);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setFocusPainted(false);
        b5.setBounds(860, 30, 130, 25);
        b5.addActionListener(this);
        p1.add(b5);

        b7 = new JButton("JOIN US");
        b7.setFont(new Font("Aharoni", Font.BOLD, 15));
        b7.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.setBounds(530, 600, 120, 40);
        b7.addActionListener(this);
        p1.add(b7);
		
		b8 = new JButton("ADMIN");
        b8.setFont(new Font("Aharoni", Font.BOLD, 15));
        b8.setForeground(Color.white);
        b8.setBackground(Color.decode("#FF8040"));
        b8.setBounds(1020,30, 100, 25);
        b8.addActionListener(this);
        p1.add(b8);

        this.add(p1);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.dispose();
            new Home().setVisible(true);
            System.out.println("Home Button Clicked");
        } else if (ae.getSource() == b2) {
            AboutUsPage aboutUsPage = new AboutUsPage();
            this.setVisible(false);
            aboutUsPage.setVisible(true);
            System.out.println("About Us Button Clicked");
        } else if (ae.getSource() == b3) {
            CarListingPage carListingPage = new CarListingPage();
            this.setVisible(false);
            carListingPage.setVisible(true);
            System.out.println("Car Listing Button Clicked");
        } else if (ae.getSource() == b4) {
            FaqsPage faqsPage = new FaqsPage();
            this.setVisible(false);
            faqsPage.setVisible(true);
            System.out.println("FAQs Button Clicked");
        } else if (ae.getSource() == b5) {
            ContactUsPage contactUsPage = new ContactUsPage();
            this.setVisible(false);
            contactUsPage.setVisible(true);
            System.out.println("Contact Us Button Clicked");
        }else if (ae.getSource() == b8) {
            AdminLogin c = new AdminLogin();
            this.setVisible(false);
            c.setVisible(true);
            System.out.println("JOIN US Button Clicked");
        }

    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
}
}
