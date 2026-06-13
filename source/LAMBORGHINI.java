package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class LAMBORGHINI extends JFrame implements ActionListener {
    JButton backButton;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3,l4,l5,l6,l7;

    public LAMBORGHINI() {
        super("LAMBORGHINI");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car19.jpg")));
        b1.setBounds(40,100,330, 170);
        b1.addActionListener(this);
        b1.setBorderPainted(false);
        panel.add(b1);

        l1 = new JLabel("Lamborghini Huracán");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l1.setBounds(100, 280, 250, 30);
        panel.add(l1);

        b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car18.jpg")));
        b2.setBounds(430,100,330, 170);
        b2.addActionListener(this);
        b2.setBorderPainted(false);
        panel.add(b2);

        l2 = new JLabel("Lamborghini Huracán Spyder");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l2.setBounds(450, 280, 300, 30);
        panel.add(l2);

        b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car17.jpg")));
        b3.setBounds(815,100,330, 170);
        b3.addActionListener(this);
        b3.setBorderPainted(false);
        panel.add(b3);

        l3 = new JLabel("Lamborghini Aventador");
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l3.setBounds(880, 280, 250, 30);
        panel.add(l3);

        b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car16.jpg")));
        b4.setBounds(40,390,330, 170);
        b4.addActionListener(this);
        b4.setBorderPainted(false);
        panel.add(b4);

        l4 = new JLabel("Lamborghini Aventador Roadster");
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l4.setBounds(45, 565, 330, 30);
        panel.add(l4);

        b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car20.jpg")));
        b5.setBounds(430,390,330, 170);
        b5.addActionListener(this);
        b5.setBorderPainted(false);
        panel.add(b5);

        l5 = new JLabel("Lamborghini Urus");
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.black);
        l5.setBounds(500, 565, 250, 30);
        panel.add(l5);

        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBounds(10, 20, 70, 25);
        backButton.addActionListener(this);
        panel.add(backButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            DieselCarPage carListingPage = new DieselCarPage();
            carListingPage.setVisible(true);
            this.dispose();
        }else if (ae.getSource() == b1) {
            Huracan st = new Huracan();
			this.dispose();
        }else if (ae.getSource() == b2) {
            Spyder st = new Spyder();
			this.dispose();
        }else if (ae.getSource() == b3) {
            Aventador st = new Aventador();
			this.dispose();
        }else if (ae.getSource() == b4) {
            Roadster st = new Roadster();
			this.dispose();
        }else if (ae.getSource() == b5) {
            Urus st = new Urus();
			this.dispose();
        }
    }

}
