package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class Xiaomi_SU7 extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public Xiaomi_SU7(){
	    super("Xiaomi_SU7");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg2.png"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Details");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.black);
        p.setBounds(530, 150, 400, 30);
        background.add(p);
		
		l1 = new JLabel("Launch:The car was formally launched on 28 March 2024");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.white);
        l1.setBounds(300, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel(" in Beijing, with Xiaomi starting to take orders on the same day");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.white);
        l2.setBounds(300, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("Design: The design team was led by chief designer Li Tianyuan,");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.white);
        l6.setBounds(300, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("with James Qiu handling the exterior and Chris Bangle as a consultant.");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.white);
        l3.setBounds(300, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Performance: The Max variant boasts 495 kW power, 838 Nm torque, and can accelerate from");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.white);
        l4.setBounds(300, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("CLTC cycle for the SU7 and 800 km (497 mi)101 kWh battery.");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.white);
        l5.setBounds(300, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("0-100 km/h in just 2.78 seconds, with a top speed of 265 km/h");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Battery and Range: It offers a range of up to 830 km (516 mi) on the");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Pricing: CNY 215,900 yuan (approximately USD 30,408).");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 435, 500, 30);
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
            XIAOMI t = new XIAOMI();
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
            Xiaomi_SU7 g1 = new Xiaomi_SU7();
            g1.setVisible(true);
});
}
}
