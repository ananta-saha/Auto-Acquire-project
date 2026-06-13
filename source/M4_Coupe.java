package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class M4_Coupe extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public M4_Coupe(){
	    super("M4_Coupe");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg2.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Details");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.black);
        p.setBounds(530, 150, 400, 30);
        background.add(p);
		
		l1 = new JLabel("The M4 models guarantee exceptional driving dynamics both on the road and racetrack");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(300, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("523 horsepower");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(300, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("3.0-liter BMW M TwinPower Turbo inline 6-cylinder");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.black);
        l6.setBounds(300, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("406 pound-feet of torque");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(300, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("Technical dataMotor: 510 hp/650 Nm");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(300, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("Cylinder&cubic capacity: 6/2,993 cc");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(300, 420, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("Upholstery: Leather 'Merino' ");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel(" Doors/Seats: 2/4 ");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Transmission: 8˜speed");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 440, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Sport Steptronic 0-100 km/h: 3.9 s");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 460, 500, 30);
        background.add(l7);
		
		
		l7 = new JLabel("Price: $80,275");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(300, 485, 500, 30);
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
            BMW t1 = new BMW();
			this.setVisible(false);
            t1.setVisible(true);
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
            M4_Coupe g5 = new M4_Coupe();
            g5.setVisible(true);
        });
    }
}
		