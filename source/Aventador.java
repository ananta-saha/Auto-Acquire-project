package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Aventador extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Aventador() {
        super("Aventador");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car17.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Lamborghini Aventador");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(470, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        JLabel textLabel1 = new JLabel("<html><body>" +
                "<b>Engine:</b><br>" +
                "Naturally aspirated or twin-turbocharged V15<br>" +// Replace with actual image URL if desired
                "<b>Horsepower:</b> 602 hp (LP 610-4) to 830 hp (STO)<br>" +
                "<b>Torque:</b> 413 lb-ft (LP 610-4) to 600 lb-ft (STO)<br>" +
                "<b>Transmission:</b> 7-speed dual-clutch automatic<br>" +
                "<b>Acceleration (0-60 mph):</b> 2.9 seconds to 3.2 seconds (LP 610-4)<br>" +
                "<b>Top Speed:</b> 202 mph (LP 610-4) to 219 mph<br>" +
                "<b>Drivetrain:</b> All-wheel drive<br>" +
                "<b>Price :</b> $400,000" +
                "</body></html>");

        textLabel1.setFont(new Font("Arial", Font.BOLD, 18));
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
            Aventador page = new Aventador();
            page.setVisible(true);
        });
    }
}
