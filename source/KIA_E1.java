package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class KIA_E1 extends JFrame implements ActionListener {
  JLabel l1,l2,l3,l4,l5,l6,l7,p;
  JButton backButton,b1;
  JLabel background;
  
  public KIA_E1(){
	    super("KIA_E1");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg1.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750); 
        this.add(background);
		
		p = new JLabel("Sorry, Out Of Stock");
        p.setFont(new Font("Arial", Font.PLAIN, 25));
        p.setForeground(Color.red);
        p.setBounds(480, 320, 400, 30);
        background.add(p);
	
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
            KIA_E1 g = new KIA_E1();
            g.setVisible(true);
        });
    }
}
		