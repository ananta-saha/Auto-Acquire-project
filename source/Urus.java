package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Urus extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Urus() {
        super("Urus");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car20.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Lamborghini Urus");
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
                "<b>Engine:</b><br>" +
                "4.0-liter twin-turbocharged V8<br>" +
                "<b>Horsepower:</b> 641 hp<br>" +
                "<b>Torque:</b> 605 lb-ft<br>" +
                "<b>Transmission:</b> 8-speed automatic<br>" +
                "<b>Acceleration (0-60 mph):</b> 3.2 seconds<br>" +
                "<b>Top Speed:</b> 190 mph<br>" +
                "<b>Drivetrain:</b> All-wheel drive with active torque vectoring<br>" +
                "<b>Seating Capacity:</b> Five<br>" +
                "<b>Cargo Capacity:</b> 21.8 cubic feet,61.6 cubic feet<br>" +
                "<b>Body Style:</b> SUV" +
                "<br><b>Price:</b> 350,000<br>" +
                "</body></html>");

        textLabel1.setFont(new Font("Arial", Font.BOLD, 18));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 295, 400, 350);
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
            Urus page = new Urus();
            page.setVisible(true);
        });
    }
}
