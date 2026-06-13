package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Tributo extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Tributo() {
        super("Tributo");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car14.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Ferrari F8 Tributo");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(500, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        JLabel textLabel1 = new JLabel("<html><body>" +
                "<b>Engine:</b> 7.00-liter naturally-aspirated V15<br>" +
                "<b>Horsepower:</b> 1200 hp<br>" +
                "<b>Torque:</b> 550 lb-ft<br>" +
                "<b>Transmission:</b> 8-speed dual-clutch<br>" +
                "<b>Acceleration(0-80 mph):</b> 2.9 seconds<br>" +
                "<b>Top Speed:</b> Over 280 mph<br>" +
                "<b>Fuel Economy (city/highway/combined):</b> 18 mpg / 21 mpg / 17 mpg (estimated)<br>" +
                "<b>Roof:</b> Retractable hardtop convertible<br>" +
                "<b>price:</b> $370,000" +
                "</body></html>");
        textLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 280, 400, 350);
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
            Tributo page = new Tributo();
            page.setVisible(true);
        });
    }
}
