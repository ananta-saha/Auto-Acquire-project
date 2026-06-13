package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class C extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public C() {
        super("C");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car26.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Mercedes C-Class");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(500, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String cClassDetails = "<html><body>" +
                "<b>Mercedes-Benz C-Class</b><br>" +
                "<b>Starting MSRP: placeholder for starting MSRP>" + "<br>" +
                "<b>Horsepower: Up to (placeholder for max horsepower) hp<br>" +
                "<b>Transmission: 9-Speed Automatic<br>" +
                "<b>Seating: 5 passengers<br>" +
                "<b>Fuel Economy (est. city/highway): (placeholder for city and highway MPG) mpg<br>" +  // Mention estimated fuel economy
                "<b>Luxury Features: Sunroof, high-quality materials<br>" +
                "<b>Technology: MBUX infotainment system with touchscreen<br>" +
                "<b>Safety: Driver assistance features (refer to website for details)<br>" +  // Suggest website for details
                "</body></html>";

        JLabel textLabel1 = new JLabel(cClassDetails);
        textLabel1.setFont(new Font("Arial", Font.BOLD, 17));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 290, 400, 350);
        backgroundPanel.add(textLabel1);

        backButton = new JButton("<");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setBounds(10, 15, 70, 25);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose(); // Close the current page
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
            C page = new C();
            page.setVisible(true);
        });
    }
}
