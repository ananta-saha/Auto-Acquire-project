package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class TESLA extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3,l4,l5;

    public TESLA() {
        super("TESLA");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car40.jpg")));
        b1.setBounds(40,70,352, 162);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("Tesla Model-3");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(160, 245, 250, 30);
        panel.add(l1);
		
		b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car39.jpg")));
        b2.setBounds(420,70,352, 171);
        b2.addActionListener(this);
		b2.setBorderPainted(false);
        panel.add(b2);
		
		l2 = new JLabel("Tesla Model-s");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(555, 245, 250, 30);
        panel.add(l2);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car38.jpg")));
        b3.setBounds(800,70,352, 172);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("Tesla Model-x");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(935, 245, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car37.jpg")));
        b4.setBounds(150,340,407, 200);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("Tesla Cybertruck");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(290, 545, 250, 30);
        panel.add(l4);
		
		b5 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car36.jpg")));
        b5.setBounds(570,340,440, 200);
        b5.addActionListener(this);
		b5.setBorderPainted(false);
        panel.add(b5);
		
		l5 = new JLabel("Tesla Roadster");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(735, 545, 250, 30);
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
			TeslaModel_3 g = new TeslaModel_3();
			this.setVisible(false);
            g.setVisible(true);
			this.dispose();
    }
	else if(ae.getSource() == b2){
			TeslaModel_S g1 = new TeslaModel_S();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b3){
			TeslaModel_X g2 = new TeslaModel_X();
			this.setVisible(false);
            g2.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b4){
			TeslaCybertruck g4 = new TeslaCybertruck();
			this.setVisible(false);
            g4.setVisible(true);
			this.dispose();
	}
	else if(ae.getSource() == b5){
			TeslaRoadster g5 = new TeslaRoadster();
			this.setVisible(false);
            g5.setVisible(true);
			this.dispose();
	}
	}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TESLA t = new TESLA();
            t.setVisible(true);
        });
    }
}
