package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class KIA_EV9 extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public KIA_EV9(){
	    super("KIA_EV9");
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
		
		l1 = new JLabel("Battery: 76.1");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(500, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("Range	Up to 541 km (336 mi)");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(500, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("plug: 240 kW, 800 V DC");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(500, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("Charging: 11 kW AC");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(500, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Wheelbase: 3,100 mm (122.0 in)");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(500, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Length: 5,010–5,015 mm (197.2–197.4 in)");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(500, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("Width: 1,980 mm (78.0 in");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Height: 1,755–1,780 mm (69.1–70.1 in");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Curb weight: 2,405–2,664 kg (5,302–5,873 lb");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("power: 160 kW (218 PS; 215 hp)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Torque: 350 N⋅m (258 lbf⋅ft)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 475, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Top speed: 185 km/h (115 mph)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 495, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $54,900");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 515, 500, 30);
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
            KIA_EV9 g3 = new KIA_EV9();
            g3.setVisible(true);
        });
    }
}
		