package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ContactUsPage extends JFrame implements ActionListener {
    JButton backButton;
	JLabel imageLabel1,background;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;

    public ContactUsPage() {
        super("CONTACT US");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/contact.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/ankon.jpg")));
        imageLabel1.setBounds(60, 35, 150, 200);
        background.add(imageLabel1);
		
		imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/ananta.jpg")));
        imageLabel1.setBounds(350, 35, 150, 200);
        background.add(imageLabel1);
		
		imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/vec.jpg")));
        imageLabel1.setBounds(170, 400, 550, 400);
        background.add(imageLabel1);
		
		imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/arghya.jpg")));
        imageLabel1.setBounds(655, 35, 150, 200);
        background.add(imageLabel1);
		
		imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/location.jpg")));
        imageLabel1.setBounds(60, 350, 150, 200);
        background.add(imageLabel1);
       
	    l1 = new JLabel("Ankon Saha");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(90, 233, 250, 30);
        background.add(l1);
		
		l4 = new JLabel("Ananta Saha");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(380, 233, 250, 30);
        background.add(l4);
		
		l7 = new JLabel("Arghya Das");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(695, 233, 250, 30);
        background.add(l7);
		
		l2 = new JLabel("sahaankon35@gmail.com");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(55, 250, 250, 30);
        background.add(l2);
		
		l5 = new JLabel("anoysaha0606@gmail.com");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(345, 250, 250, 30);
        background.add(l5);
		
		l8 = new JLabel("arghyadas108@gmail.com");
        l8.setFont(new Font("Arial", Font.PLAIN, 15));
        l8.setForeground(Color.black);
        l8.setBounds(650, 250, 250, 30);
        background.add(l8);
		
		l3 = new JLabel("01867724458");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(85, 270, 250, 30);
        background.add(l3);
		
		l6 = new JLabel("01862787757");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(380, 270, 250, 30);
        background.add(l6);
		
		l9 = new JLabel("01316132449");
        l9.setFont(new Font("Arial", Font.PLAIN, 15));
        l9.setForeground(Color.black);
        l9.setBounds(693, 270, 250, 30);
        background.add(l9);
		
		l10 = new JLabel("408/1,kuratoli,khilkhet,Dhaka");
        l10.setFont(new Font("Arial", Font.PLAIN, 15));
        l10.setForeground(Color.black);
        l10.setBounds(60, 500, 250, 30);
        background.add(l10);
		
		l10 = new JLabel("1229,Bangladesh");
        l10.setFont(new Font("Arial", Font.PLAIN, 15));
        l10.setForeground(Color.black);
        l10.setBounds(60, 520, 250, 30);
        background.add(l10);

        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        backButton.setBounds(1105, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);

	}
            public void actionPerformed(ActionEvent ae) {
		     if(ae.getSource() == backButton) {
             Home home = new Home();
             home.setVisible(true);
             this.dispose();
            }
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContactUsPage contactUsPage = new ContactUsPage();
            contactUsPage.setVisible(true);
        });
    }
}
