package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Chiron extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Chiron() {
        super("Chiron");
        setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel backgroundPanel = new JPanel() {

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/ALL IMAGES/bg3.jpg"));
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car9.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Bugatti Chiron");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(510, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String chironDetails = "<html><body>" +
                "<b>Bugatti Chiron</b><br>" +
                "<b>Engine:</b> W16 8.0L Quad-Turbocharged<br>" +
                "<b>Horsepower:</b> 1,500 hp<br>" +
                "<b>Acceleration (0-60 mph):</b> 2.4 seconds<br>" +
                "<b>Fuel Economy (city/highway):placeholder for combined city and highway MPG>" +
                "<b>Top Speed:</b> 261 mph (limited)<br>" +
                "<b>Drivetrain:</b> All-Wheel Drive<br>" +
                "<b>Price: $450,000<br>" +
                "</body></html>";

        JLabel textLabel1 = new JLabel(chironDetails);
        textLabel1.setFont(new Font("Arial", Font.BOLD, 20));
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
            Chiron page = new Chiron();
            page.setVisible(true);
        });
    }
}
