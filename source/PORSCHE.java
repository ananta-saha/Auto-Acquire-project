package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class PORSCHE extends JFrame implements ActionListener {
    JButton backButton;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3,l4,l5,l6,l7;

    public PORSCHE() {
        super("PORSCHE");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car1.jpg")));
        b1.setBounds(40,100,330, 170);
        b1.addActionListener(this);
        b1.setBorderPainted(false);
        panel.add(b1);

        l1 = new JLabel("Porsche 718 Boxster");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l1.setBounds(100, 280, 250, 30);
        panel.add(l1);

        b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car2.jpg")));
        b2.setBounds(430,100,330, 170);
        b2.addActionListener(this);
        b2.setBorderPainted(false);
        panel.add(b2);

        l2 = new JLabel("Porsche 911");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l2.setBounds(510, 280, 300, 30);
        panel.add(l2);

        b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car11.jpg")));
        b3.setBounds(815,100,330, 170);
        b3.addActionListener(this);
        b3.setBorderPainted(false);
        panel.add(b3);

        l3 = new JLabel("Porsche Cayenne");
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l3.setBounds(890, 280, 250, 30);
        panel.add(l3);

        b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car35.jpg")));
        b4.setBounds(40,390,330, 170);
        b4.addActionListener(this);
        b4.setBorderPainted(false);
        panel.add(b4);

        l4 = new JLabel("Porsche Taycan");
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l4.setBounds(100, 565, 250, 30);
        panel.add(l4);
		
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
            Boxster st = new Boxster();
			this.dispose();
        }else if (ae.getSource() == b2) {
            model_2 st = new model_2();
			this.dispose();
        }else if (ae.getSource() == b3) {
            Cayenee st = new Cayenee();
			this.dispose();
        }else if (ae.getSource() == b4) {
            Taycan st = new Taycan();
			this.dispose();
        }
    }

}
