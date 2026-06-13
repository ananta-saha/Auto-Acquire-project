package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class TeslaModel_S extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public TeslaModel_S(){
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
		
		l1 = new JLabel("100-kWh lithium-ion battery pack and two electric motors");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.white);
        l1.setBounds(300, 245, 400, 30);
        background.add(l1);
		
		l2 = new JLabel("he base model can accelerate from zero to 60 mph in 3.1 seconds");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.white);
        l2.setBounds(300, 270, 500, 30);
        background.add(l2);
		
		l6 = new JLabel("Notable features include a 17-inch touch screen, 8-inch rear-seat display, navigation, Wi-Fi hotspot");
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setForeground(Color.white);
        l6.setBounds(300, 295, 500, 30);
        background.add(l6);
		
		l3 = new JLabel("wireless device charging,HD Radio,satellite radio,22-speaker audio system,Bluetooth and five USB ports");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.white);
        l3.setBounds(300, 320, 500, 30);
        background.add(l3);
		
		l4 = new JLabel("12.3-inch digital gauge cluster");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.white);
        l4.setBounds(300, 345, 660, 30);
        background.add(l4);
		
		l5 = new JLabel("tri-zone automatic climate control, and a fixed-pane panoramic sunroof");
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setForeground(Color.white);
        l5.setBounds(300, 415, 500, 30);
        background.add(l5);
		
		l7 = new JLabel("Range: 65 mph: 85D: 295 miles,P85+,P85,85: 285 miles,P85D: 285 miles,60: 215 miles");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 370, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Length: Approximately 197.7 inches (5,021 mm)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 395, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Wheelbase: Approximately 116.5 inches (2,960 mm)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 435, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Maximum Total Cargo Volume with Driver and Front Passenger: Approximately 1,828 liters (64.6 cubic feet)");
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setForeground(Color.white);
        l7.setBounds(300, 455, 500, 30);
        background.add(l7);
		
		l7 = new JLabel("Price: $74,630 ");
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
            TeslaModel_S g1 = new TeslaModel_S();
            g1.setVisible(true);
        });
    }
}
		