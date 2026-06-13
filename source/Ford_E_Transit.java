package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class Ford_E_Transit extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public Ford_E_Transit(){
	    super("Ford_E_Transit");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Details");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.black);
        p.setBounds(530, 150, 400, 30);
        background.add(p);
		
		l1 = new JLabel("Class: Light commercial vehicle (M)");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(300, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("Body style	3/4-door van");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(300, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("Engine	1.5L");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(300, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("Transmission: 4-speed manual");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(300, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Range: 159 miles");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(300, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Powertrain: 89kWh lithium-ion battery pack");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(300, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("HOrsePOwer: 135hp");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Payload Capacity: Up to 1,100 kilograms (2,425 pounds)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Towing Capacity: Up to 2,000 kg (4,409 lbs)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Range: 159 miles");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Available SYNC® 4 with a 12-inch display");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 475, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("360-Degree Camera with split view");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 495, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $48,590");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 515, 500, 30);
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
            FORD t2 = new FORD();
			this.setVisible(false);
            t2.setVisible(true);
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
            Ford_E_Transit g2 = new Ford_E_Transit();
            g2.setVisible(true);
        });
    }
}
		