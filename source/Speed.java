package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Speed extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Speed() {
        super("Speed");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car5.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Bentley Continental GT Speed");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(440, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String continentalDetails = "<html><body>" +
                "<b>Engine:placeholder for engine type" + "<br>" +
                "<b>Horsepower:laceholder for horsepower>" + "<br>" +
                "<b>Torque:<placeholder for torque>" + "<br>" +
                "<b>Transmission:<placeholder for transmission type (e.g., 8-Speed Automatic)" + "<br>" +
                "<b>Seating:placeholder for seating capacity (e.g., 4)" + "<br>" +
                "<b>Fuel Economy (city/highway):placeholder for city and highway MPG>" + "<br>" +
                "<b>Starting MSRP:</b> " + "<placeholder for starting MSRP>" + "<br>" +
                "<b>Drivetrain:</b> All-Wheel Drive<br>" +  // Add drivetrain information
                "<b>Performance:</b> 0-60 mph in (placeholder for 0-60 mph time) seconds<br>" +  // Add performance details
                "<b>Top Speed:</b> Up to (placeholder for top speed) mph<br>" +  // Add top speed information
                // Briefly mention interior features
                "</body></html>";

        JLabel textLabel1 = new JLabel(continentalDetails);
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
            Speed page = new Speed();
            page.setVisible(true);
        });
    }
}
