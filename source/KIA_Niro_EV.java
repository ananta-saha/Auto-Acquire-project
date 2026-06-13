package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class KIA_Niro_EV extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public KIA_Niro_EV(){
	    super("KIA_Niro_EV");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg1.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Details");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.black);
        p.setBounds(530, 150, 400, 30);
        background.add(p);
		
		l1 = new JLabel("Range: 253 miles");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(480, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("Horsepower: 201");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(480, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("500 kWh of charging credits");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(480, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("1,750 – 2,000 miles of driving range");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(480, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Interior Comfort:  63.7 cu. ft.");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(480, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Technology: Dual Panoramic Displays");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(480, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("10” Head-Up Display");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Wheelbase: 2.72 m");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Turning circle: 10.6 m");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Boot(seats down)1,392 L");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Battery capacity: 64.8 kWh");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 475, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Anti-lock brake system");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 495, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $40,875");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(480, 515, 500, 30);
        background.add(l7);
		
		b1 = new JButton("shop Now");
        b1.setFont(new Font("Aharoni", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.green);
        b1.setBounds(530, 600, 110, 40);
        b1.addActionListener(this);
        background.add(b1);
		
		backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(10, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);

  }
  public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            KIA t3 = new KIA();
			this.setVisible(false);
            t3.setVisible(true);
            this.dispose();
        }
		else if(ae.getSource() == b1){
			Login p=new Login();
			this.setVisible(false);
			p.setVisible(true);
			this.dispose();
    }
  }
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KIA_Niro_EV g4 = new KIA_Niro_EV();
            g4.setVisible(true);
        });
    }
}
		