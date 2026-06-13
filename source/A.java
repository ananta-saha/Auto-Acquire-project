package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener{
    JButton backButton, shopNowButton;

    public A() {
        super("A");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car25.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel = new JLabel("Mercedes A-Class");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(490, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        String mercedesADetails = "<html><body><b>Mercedes-Benz A-Class</b><br>" +
                "• Starting MSRP: Around $35,000<br>" +
                "• Compact luxury hatchback<br>" +
                "• Available engine: 2.0L turbocharged 4-cylinder<br>" +
                "• Up to 221 hp (depending on model)<br>" +
                "• Up to 36 mpg highway (estimated)<br>" +
                "• MBUX infotainment system, sunroof (standard)<br>" +
                "• Driver assistance features (available): Active braking, lane departure warning<br>" +
                "• Known for: Stylish design, comfortable ride, advanced technology<br>" +
                "</body></html>";

        JLabel textLabel1 = new JLabel(mercedesADetails);
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
            A page = new A();
            page.setVisible(true);
        });
    }
}
