package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Spur extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Spur() {
        super("Spur");
        setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/ALL IMAGES/bg3.jpg"));
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car6.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Bentley Flying Spur");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(490, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        JLabel textLabel1 = new JLabel("<html><body><br>" +
                "**Engine and Performance**<br>" +
                "- Engine: 6.0-liter W12<br>" +
                "- Twin-turbocharged with direct inter-cooling<br>" +
                "- Power Output: 616 bhp @ 6000 rpm<br>" +
                "- Torque: 800 Nm @ 2000 rpm<br>" +
                "- Transmission: 8-speed automatic with block shifting<br>" +
                "- Top Speed: 320 kmph<br>" +
                "- 0-100 kmph: 3.8 seconds<br>" +
                "**Dimensions**<br>" +
                "- Length: 5295 mm<br>" +
                "- Width: 2208 mm (including mirrors)<br>" +
                "- Height: 1488 mm<br>" +
                "- Wheelbase: 3065 mm<br></body></html>");
        textLabel1.setFont(new Font("Arial", Font.BOLD, 17));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 290, 400, 350);
        backgroundPanel.add(textLabel1);

        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBounds(10, 15, 70, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose(); 
            }
        });
        backgroundPanel.add(backButton);

        shopNowButton = new JButton("SHOP NOW");
        shopNowButton.setFont(new Font("Arial", Font.BOLD, 16));
        shopNowButton.setBackground(Color.black);
        shopNowButton.setForeground(Color.white);
        shopNowButton.setBounds(520, 630, 130, 35);
		shopNowButton.addActionListener(this);
        backgroundPanel.add(shopNowButton);

        this.setContentPane(backgroundPanel);
        setVisible(true);
    }
	public void actionPerformed(ActionEvent ae) {
		    if(ae.getSource() == shopNowButton){
			Login p=new Login();
			this.setVisible(false);
			p.setVisible(true);
			this.dispose();
    }
	 }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Spur page = new Spur();
            page.setVisible(true);
        });
    }
}
