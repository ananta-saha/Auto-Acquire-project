package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class XIAOMI extends JFrame implements ActionListener {
    JButton backButton;
	JButton b1;
	JLabel l1;

    public XIAOMI() {
        super("XIAOMI");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
		
		b1 = new JButton(new ImageIcon(getClass().getResource("/ALL IMAGES/car62.jpg")));
        b1.setBounds(300,100,500,333);
        b1.addActionListener(this);
		b1.setBorderPainted(false);
        panel.add(b1);
		
		l1 = new JLabel("Xiaomi SU7");
        l1.setFont(new Font("Arial", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(500,450, 250, 30);
        panel.add(l1);
		
        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(10, 20, 70, 25);
        backButton.addActionListener(this);
        panel.add(backButton);
		
		this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
			Xiaomi_SU7 g1 = new Xiaomi_SU7();
			this.setVisible(false);
            g1.setVisible(true);
			this.dispose();
	}else if (ae.getSource() == backButton) {
            ElectricCarPage carListingPage = new ElectricCarPage();
            carListingPage.setVisible(true);
	this.dispose();}}
	
 public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            XIAOMI f = new XIAOMI();
            f.setVisible(true);
});
}}
