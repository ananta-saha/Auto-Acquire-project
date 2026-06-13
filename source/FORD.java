package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class FORD extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b3,b4,b5;
	JLabel l1,l3,l4,l5;

    public FORD() {
        super("FORD");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car47.jpg")));
        b1.setBounds(80,70,460, 245);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("Mustang Match-E");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(240, 320, 250, 30);
        panel.add(l1);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car48.jpg")));
        b3.setBounds(650,70,460, 245);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("Ford Focus Electric");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(820, 320, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car49.jpg")));
        b4.setBounds(80,370,460, 250);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("Ford E-Transit");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(240, 620, 250, 30);
        panel.add(l4);
		
		b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car50.jpg")));
        b5.setBounds(650,370,460, 250);
        b5.addActionListener(this);
		b5.setBorderPainted(false);
        panel.add(b5);
		
		l5 = new JLabel("Ford F-150 Lightning");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(820, 620, 250, 30);
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
            Mustang_Match_E g = new Mustang_Match_E();
            g.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b3) {
            Ford_Focus_Electric g1 = new Ford_Focus_Electric();
            g1.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b4) {
            Ford_E_Transit g2 = new Ford_E_Transit();
            g2.setVisible(true);
            this.dispose();
        }
		else if (ae.getSource() == b5) {
            Ford_F_150_Lightning g3 = new Ford_F_150_Lightning();
            g3.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FORD t2 = new FORD();
            t2.setVisible(true);
        });
    }
}
