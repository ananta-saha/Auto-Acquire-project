package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class TeslaCybertruck extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public TeslaCybertruck(){
	    super("TeslaModel-S");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg3.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Details");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.black);
        p.setBounds(530, 150, 400, 30);
        background.add(p);
		
		l1 = new JLabel("Body Style: 4-door crew cab");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.white);
        l1.setBounds(300, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("Transmition: sibgle-speed fixed(15:1 ratio)");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.white);
        l2.setBounds(300, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("Battery:0.192 kwh,48 v lithium-ioon");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.white);
        l6.setBounds(300, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("Electric Range:250-340 mi(400-545km)(EPA east");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.white);
        l3.setBounds(300, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Length	223.74 in (5,683 mm)");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.white);
        l4.setBounds(300, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Width	79.99 in (2,032 mm)");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.white);
        l5.setBounds(300, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("Height	70.7 in (1,796 mm)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Towing capacity of 7,500 pounds (single-motor) to 14,000 pounds (tri-motor)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Largest display ever in a Tesla, measuring 18.5 inches diagonally");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Quad-motor AWD");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $79,990 ");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 475, 500, 30);
        background.add(l7);
		
		b1 = new JButton("shop Now");
        b1.setFont(new Font("Aharoni", Font.BOLD, 15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
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
            TESLA t = new TESLA();
			this.setVisible(false);
            t.setVisible(true);
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
            TeslaCybertruck g4 = new TeslaCybertruck();
            g4.setVisible(true);
        });
    }
}
		