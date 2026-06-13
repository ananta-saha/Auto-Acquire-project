package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class BMW extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1,l2,l3,l4,l5,l6;

    public BMW() {
        super("BMW");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car41.jpg")));
        b1.setBounds(40,70,337, 162);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("X1 SUV");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(180, 235, 250, 30);
        panel.add(l1);
		
		b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car42.jpg")));
        b2.setBounds(410,70,355, 162);
        b2.addActionListener(this);
		b2.setBorderPainted(false);
        panel.add(b2);
		
		l2 = new JLabel("X2 Coupe SUV");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(550, 235, 250, 30);
        panel.add(l2);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car43.jpg")));
        b3.setBounds(800,70,342, 162);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("X3 M SUV");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(940, 235, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car44.jpg")));
        b4.setBounds(40,340,340, 164);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("X4 SUV");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(190, 515, 250, 30);
        panel.add(l4);
		
		b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car45.jpg")));
        b5.setBounds(410,340,339, 164);
        b5.addActionListener(this);
		b5.setBorderPainted(false);
        panel.add(b5);
		
		l5 = new JLabel("X3 SUV");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(550, 515, 250, 30);
        panel.add(l5);
		
		b6 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car46.jpg")));
        b6.setBounds(800,340,339, 164);
        b6.addActionListener(this);
		b6.setBorderPainted(false);
        panel.add(b6);
		
		l5 = new JLabel("M4 Coupe");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(940, 515, 250, 30);
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
		else if(ae.getSource() == b1){
			X1_SUV g = new X1_SUV();
			this.setVisible(false);
            g.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b2){
			X2_Coupe_SUV g1 = new X2_Coupe_SUV();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b3){
			X3_M_SUV g2 = new X3_M_SUV();
			this.setVisible(false);
            g2.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b4){
			X4_SUV g3 = new X4_SUV();
			this.setVisible(false);
            g3.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b5){
			X3_SUV g4 = new X3_SUV();
			this.setVisible(false);
            g4.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b6){
			M4_Coupe g5 = new M4_Coupe();
			this.setVisible(false);
            g5.setVisible(true);
			this.dispose();
	}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BMW t1 = new BMW();
            t1.setVisible(true);
        });
    }
}
