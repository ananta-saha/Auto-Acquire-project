package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class E extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public E() {
        super("E");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car27.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Mercedes E-Class");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(500, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String eClassDetails = "<html><body>" +
                "<b>Mercedes-Benz E-Class</b><br>" +
                "<b>Starting MSRP:placeholder for starting MSRP>" + "<br>" +
                "<b>Engine Options: Various options including turbocharged 4-cylinder, V6, or mild hybrid<br>" +
                "<b>Horsepower Range:placeholder for horsepower range (e.g., 255-429 hp)" + "<br>" +
                "<b>Transmission: 9-Speed Automatic<br>" +
                "<b>Seating: 5 (Sedan), Up to 7 (Wagon)<br>" +
                "<b>Fuel Economy (city/highway): Up to (placeholder for city and highway MPG) mpg<br>" +
                "<b>Luxury Features: High-quality materials, advanced technology<br>" +
                "<b>Safety Features:</b> Driver assistance systems including automatic emergency braking.<br>" +
                "</body></html>";

        JLabel textLabel1 = new JLabel(eClassDetails);
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
            E page = new E();
            page.setVisible(true);
        });
    }
}
