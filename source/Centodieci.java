package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Centodieci extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Centodieci() {
        super("Centodieci");
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

         JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car8.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);



        JLabel textLabel = new JLabel("Bugatti Centodieci");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(480, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String centodieciDetails = "<html><body>" +
                "<b>Bugatti Centodieci</b><br>" +
                "<b>Limited Edition:</b> 10 Units<br>" +
                "<b>Engine:</b> W16 8.0L Quad-Turbocharged<br>" +
                "<b>Horsepower:</b> 1,600 hp<br>" +
                "<b>Acceleration (0-60 mph):</b> 2.4 seconds (estimated)<br>" +
                "<b>Top Speed:</b> 236 mph (estimated)<br>" +
                "<b>Drivetrain:</b> All-Wheel Drive<br>" +
                "<b>Price:</b> Starting at $8.9 million<br>" +
                "</body></html>";

        JLabel textLabel1 = new JLabel(centodieciDetails);
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
            Centodieci page = new Centodieci();
            page.setVisible(true);
        });
    }
}
