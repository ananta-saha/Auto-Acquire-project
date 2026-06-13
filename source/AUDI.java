package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class AUDI extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1,l2,l3,l4,l5,l6;

    public AUDI() {
        super("AUDI");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car56.jpg")));
        b1.setBounds(40,70,337, 162);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("AUDI E-TRON GT QUATTRO");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(120, 235, 250, 30);
        panel.add(l1);
		
		b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car57.jpg")));
        b2.setBounds(410,70,355, 162);
        b2.addActionListener(this);
		b2.setBorderPainted(false);
        panel.add(b2);
		
		l2 = new JLabel("Audi RS e-tron GT");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(530, 235, 250, 30);
        panel.add(l2);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car58.jpg")));
        b3.setBounds(800,70,333, 162);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("Audi Q4 e-tron");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(915, 235, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car59.jpg")));
        b4.setBounds(40,340,345, 162);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("Audi Q8 Sportback e-tron");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(120, 515, 250, 30);
        panel.add(l4);
		
		b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car60.jpg")));
        b5.setBounds(425,340,322, 162);
        b5.addActionListener(this);
		b5.setBorderPainted(false);
        panel.add(b5);
		
		l5 = new JLabel("Audi Q8 e-tron");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(540, 515, 250, 30);
        panel.add(l5);
		
		b6 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car61.jpg")));
        b6.setBounds(800,340,346, 162);
        b6.addActionListener(this);
		b6.setBorderPainted(false);
        panel.add(b6);
		
		l5 = new JLabel("Audi SQ-8 Sportback E-Tron");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(895, 515, 250, 30);
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
            AUDI_E_TRON_GT_QUATTRO g = new AUDI_E_TRON_GT_QUATTRO();
            g.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b2) {
            AUDI_RS_e_tron_GT g1 = new AUDI_RS_e_tron_GT();
            g1.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b3) {
            Audi_Q4_e_tron g2 = new Audi_Q4_e_tron();
            g2.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b4) {
            Audi_Q8_Sportback_e_tron g3 = new Audi_Q8_Sportback_e_tron();
            g3.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b5) {
            Audi_Q8_e_tron g4 = new Audi_Q8_e_tron();
            g4.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b6) {
            Audi_SQ_8_Sportback_E_tron g5 = new Audi_SQ_8_Sportback_E_tron();
            g5.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AUDI t6 = new AUDI();
            t6.setVisible(true);
        });
    }
}
