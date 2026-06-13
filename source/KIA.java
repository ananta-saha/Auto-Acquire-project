package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class KIA extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3,l4,l5;

    public KIA() {
        super("KIA");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/51.jpg")));
        b1.setBounds(40,70,330, 167);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("KIA E1");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(180, 245, 250, 30);
        panel.add(l1);
		
		b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car52.jpg")));
        b2.setBounds(420,70,330, 170);
        b2.addActionListener(this);
		b2.setBorderPainted(false);
        panel.add(b2);
		
		l2 = new JLabel("KIA EV6");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(555, 245, 250, 30);
        panel.add(l2);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car53.jpg")));
        b3.setBounds(800,70,330, 167);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("KIA Soul EV");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(930, 245, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car54.jpg")));
        b4.setBounds(200,360,330, 170);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("KIA EV9");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(330, 535, 250, 30);
        panel.add(l4);
		
		b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car55.jpg")));
        b5.setBounds(600,360,340, 167);
        b5.addActionListener(this);
		b5.setBorderPainted(false);
        panel.add(b5);
		
		l5 = new JLabel("KIA Niro EV");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(730, 535, 250, 30);
        panel.add(l5);
		
        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(10, 20, 70, 25);
        backButton.addActionListener(this);
        panel.add(backButton);
		
		this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            ElectricCarPage carListingPage = new ElectricCarPage();
            carListingPage.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b1) {
            KIA_E1 g = new KIA_E1();
            g.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b2) {
            KIA_EV6 g1 = new KIA_EV6();
            g1.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b3) {
            KIA_Soul_EV g2 = new KIA_Soul_EV();
            g2.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b4) {
            KIA_EV9 g3 = new KIA_EV9();
            g3.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b5) {
            KIA_Niro_EV g4 = new KIA_Niro_EV();
            g4.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KIA t3 = new KIA();
            t3.setVisible(true);
        });
    }
}
