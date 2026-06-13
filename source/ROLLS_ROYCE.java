package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class ROLLS_ROYCE extends JFrame implements ActionListener {
    JButton backButton;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3,l4,l5,l6,l7;

    public ROLLS_ROYCE() {
        super("ROLLS_ROYCE");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);


        b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car30.jpg")));
        b1.setBounds(40,100,330, 170);
        b1.addActionListener(this);
        b1.setBorderPainted(false);
        panel.add(b1);

        l1 = new JLabel("Rolls-Royce Phantom");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.black);
        l1.setBounds(100, 280, 250, 30);
        panel.add(l1);

        b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car33.jpg")));
        b2.setBounds(430,100,330, 170);
        b2.addActionListener(this);
        b2.setBorderPainted(false);
        panel.add(b2);

        l2 = new JLabel("Rolls Royce Droptail La RoseNoire");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l2.setBounds(440, 280, 300, 30);
        panel.add(l2);

        b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car34.jpg")));
        b3.setBounds(815,100,330, 170);
        b3.addActionListener(this);
        b3.setBorderPainted(false);
        panel.add(b3);

        l3 = new JLabel("Rolls Royce Spectre");
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l3.setBounds(890, 280, 250, 30);
        panel.add(l3);

        b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car32.jpg")));
        b4.setBounds(40,390,330, 170);
        b4.addActionListener(this);
        b4.setBorderPainted(false);
        panel.add(b4);

        l4 = new JLabel("Rolls Royce Cullinan");
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l4.setBounds(100, 565, 250, 30);
        panel.add(l4);

        b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car31.jpg")));
        b5.setBounds(430,390,330, 170);
        b5.addActionListener(this);
        b5.setBorderPainted(false);
        panel.add(b5);

        l5 = new JLabel("Rolls Royce Black Badge");
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.black);
        l5.setBounds(480, 565, 250, 30);
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
        } else if (ae.getSource() == b1) {
            RollsRoycePhantomPage phantomPage = new RollsRoycePhantomPage();
			this.dispose();
        } else if (ae.getSource() == b2) {
            DropTail Drop = new DropTail();
			this.dispose();
        } else if (ae.getSource() == b3) {
            Spectre sp = new Spectre();
			this.dispose();
        } else if (ae.getSource() == b4) {
            Cullinan Drop = new Cullinan();
			this.dispose();
        }else if (ae.getSource() == b5) {
            Black_Badge Drop = new Black_Badge();
			this.dispose();

        }
    }


}
