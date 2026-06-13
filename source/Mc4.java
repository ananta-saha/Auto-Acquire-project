package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mc4 extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Mc4() {
        super("Mc4");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car23.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("McLaren 650S");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(510, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String mclarenDetails = "<html><body>" +
                "<b>McLaren 650S</b><br>" +
                "<b>Engine:placeholder for engine type " + "<br>" +
                "<b>Horsepower:placeholder for horsepower>" + " hp<br>" +
                "<b>Acceleration (0-60 mph):placeholder for 0-60 mph time>" + " seconds<br>" +
                "<b>Top Speed:placeholder for top speed>" + " mph<br>" +
                "<b>Transmission:placeholder for transmission type (e.g., 7-Speed Dual-Clutch)" + "<br>" +
                "<b>Drivetrain: Rear-Wheel Drive<br>" +
                "<b>Curb Weight: Around 3,100 lbs<br>" +  // Placeholder for weight
                  "</body></html>";

        JLabel textLabel1 = new JLabel(mclarenDetails);
        textLabel1.setFont(new Font("Arial", Font. BOLD, 19));
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
            Mc4 page = new Mc4();
            page.setVisible(true);
        });
    }
}
