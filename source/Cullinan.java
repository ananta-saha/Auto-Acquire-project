package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class Cullinan extends JFrame implements ActionListener {
    JButton backButton, shopNowButton;

    public Cullinan() {
        super("Cullinan");
        setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Adding background
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

        // Adding car image 1
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car32.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);



        JLabel textLabel = new JLabel(" Rolls Royce Cullinan");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(480, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        JLabel textLabel1 = new JLabel("<html><body>" +
                "<b>Body Style:</b> Five-door SUV<br>" +
                "<b>Engine:</b> 6.75-liter Twin-Turbocharged V12<br>" +
                "<b>Horsepower:</b> 563 hp<br>" +
                "<b>Torque:</b> 627 lb-ft<br>" +
                "<b>Transmission:</b> Eight-speed Automatic<br>" +
                "<b>Acceleration (0-60 mph):</b> 4.9 seconds<br>" +
                "<b>Top Speed:</b> 155 mph <br>" +
                "<b>Drivetrain:</b> All-wheel drive<br>" +
                "<b>Fuel Economy (city/highway/combined):</b> 15 mpg / 19 mpg / 17 mpg <br>" +
                "<b>Price:</b> $338,850 (USD)" +
                "</body></html>");
        textLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 280, 400, 350);
        backgroundPanel.add(textLabel1);


        JLabel textLabel2 = new JLabel("<html><body>" +
                "<b>Special Features:</b><br><br>" +
                "1. Panoramic sunroof<br>" +
                "2. Split tailgate<br>" +
                "3. Air suspension<br>" +
                "4. Signature Rolls-Royce features<br>" +
                "5. Rear-seat entertainment system<br>" +
                "6. Bespoke customization" +
                "</body></html>");
        textLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel2.setForeground(Color.white);
        textLabel2.setBounds(740, 260, 400, 350);
        backgroundPanel.add(textLabel2);


        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBounds(10, 15, 70, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose(); // Close the current page
            }
        });
        backgroundPanel.add(backButton);

        // Add the "SHOP NOW" button
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
            Cullinan page = new Cullinan();
            page.setVisible(true);
        });
    }
}
