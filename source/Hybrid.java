package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hybrid extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public Hybrid() {
        super("Hybrid");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car3.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);



        JLabel textLabel = new JLabel("Bentley Bentayga Hybrid");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(460, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String bentaygaHybridDetails = "<html><body>" +
                "<b>Combined Horsepower:placeholder for combined horsepower" + "<br>" +
                "<b>Transmission:placeholder for transmission type" + "<br>" +
                "<b>Seating:placeholder for seating capacity (e.g., 5 or 7)" + "<br>" +
                "<b>Fuel Economy (city/highway):placeholder for combined city and highway MPG>" +  // Mention combined fuel economy with electric equivalent
                "<b>Starting MSRP:placeholder for starting MSRP>" + "<br>" +
                "<b>Drivetrain: All-Wheel Drive<br>" +  // Add drivetrain information
                "<b>Performance:0-60 mph in (placeholder for 0-60 mph time) seconds<br>" +  // Add performance details
                "<b>Top Speed: Up to 290 mph<br>" +  // Add top speed information
                "<b>Technology: 10.9-inch touchscreen infotainment system" +  // Mention core tech features with a link for details
                "</body></html>";

        JLabel textLabel1 = new JLabel(bentaygaHybridDetails);
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
            Hybrid page = new Hybrid();
            page.setVisible(true);
        });
    }
}
