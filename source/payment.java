package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener {
        JButton b2,backButton;

    public payment() {
        super("payment");
        this.setSize(1200, 710);
        setLocationRelativeTo(null); 
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/pay.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 1200, 710);
        this.add(backgroundLabel);
		
		b2= new JButton("Pay Now");
        b2.setFont(new Font("Aharoni", Font.BOLD, 20));
        b2.setForeground(Color.black);
		b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false); 		
        b2.setBounds(30,395,240, 50);
        b2.addActionListener(this);
        backgroundLabel.add(b2);
		
		backButton = new JButton("<<");
        backButton.setFont(new Font("Serif", Font.BOLD, 15));
        backButton.setForeground(Color.black);
        backButton.setBounds(20,15, 70, 25);
		backButton.setBorderPainted(false);
		backButton.addActionListener(this);
        backgroundLabel.add(backButton);

	}
		
		public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b2)
        {
			Bank b=new Bank();
            this.setVisible(false);
            b.setVisible(true);
        }
		else if(ae.getSource() == backButton){
			Login p=new Login();
			this.setVisible(false);
			p.setVisible(true);
			this.dispose();
    }
		}
}
		
