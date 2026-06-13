package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class KIA_EV6 extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public KIA_EV6(){
	    super("KIA_EV6");
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
		
		l1 = new JLabel("5 seater");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(500, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("length: 4695 mm");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(500, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("width: 1890 mm");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(500, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("wheelbase: 2900 mm");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(500, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Battery Capacity: 77.4 kWh");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(500, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Motor Power: 239 kW");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(500, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("Max Power: 320.55bhp");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Max Torque: 605Nm");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Range: 708 km");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Battery Warranty: 8 Years");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Charging Time: (D.C)73Min-50kW-(10-80%)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 475, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Charging PortCCS-II");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(500, 495, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $43,925");
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
            KIA_EV6 g1 = new KIA_EV6();
            g1.setVisible(true);
        });
    }
}
		
		