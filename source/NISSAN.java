package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class NISSAN extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4;

    public NISSAN() {
        super("NISSAN");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car67.jpg")));
        b1.setBounds(100,70,413,216);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("Nissan Ariya");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(250,290, 250, 30);
        panel.add(l1);
		
		b2 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car66.jpg")));
        b2.setBounds(580,70,439,216);
        b2.addActionListener(this);
		b2.setBorderPainted(false);
        panel.add(b2);
		
		l2 = new JLabel("Nissan Esflow");
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(730, 290, 250, 30);
        panel.add(l2);
		
		b3 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car65.jpg")));
        b3.setBounds(100,380,418,216);
        b3.addActionListener(this);
		b3.setBorderPainted(false);
        panel.add(b3);
		
		l3 = new JLabel("Nissan Leaf");
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(250,600, 250, 30);
        panel.add(l3);
		
		b4 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car64.jpg")));
        b4.setBounds(580,380,446,216);
        b4.addActionListener(this);
		b4.setBorderPainted(false);
        panel.add(b4);
		
		l4 = new JLabel("Nissan Leaf Plus");
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(730,600, 250, 30);
        panel.add(l4);

        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(10, 20, 70, 25);
        backButton.addActionListener(this);
        panel.add(backButton);
		
		this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
          if(ae.getSource() == b1){
			Nissan_Ariya g1 = new Nissan_Ariya();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}else if(ae.getSource() == b2){
			Nissan_Esflow g1 = new Nissan_Esflow();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}else if(ae.getSource() == b3){
			Nissan_Leaf g1 = new Nissan_Leaf();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}else if(ae.getSource() == b4){
			Nissan_Leaf_Plus g1 = new Nissan_Leaf_Plus();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}else if (ae.getSource() == backButton) {
            ElectricCarPage carListingPage = new ElectricCarPage();
            carListingPage.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NISSAN t = new NISSAN();
            t.setVisible(true);
});
}}
