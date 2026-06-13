package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class DropTail extends JFrame implements ActionListener {
    JButton backButton, shopNowButton;

    public DropTail() {
        super("DropTail");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car33.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);


        JLabel textLabel = new JLabel("Droptail La RoseNoire");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(480, 260, 300, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel1 = new JLabel("<html><body><b>Type:</b> Two-door convertible<br><b>Status:</b> One-of-a-kind<br><b>Inspiration:</b> Black Baccara rose<br><b>Engine:</b> 6.75-liter twin-turbocharged V12<br><b>Horsepower:</b> 563 hp<br><b>Torque:</b> 625 lb-ft<br><b>Acceleration (0-60 mph):</b> 4.8 seconds<br><b>Top Speed:</b> 155 mph (estimated)</body></html>");
        textLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 280, 400, 350);
        backgroundPanel.add(textLabel1);


        JLabel textLabel2 = new JLabel("<html><body>" +
                "<b>Price:</b> $30 million <br>" +
                "<b>Special features:</b><br>" +
                "Bespoke two-tone paint job with a deep pomegranate color transitioning to black<br>" +
                "Rose-shaped grille<br>" +
                "Rose-themed embroidery on the interior<br>" +
                "Bespoke starlight headliner<br>" +
                "Other undisclosed custom features" +
                "</body></html>");
        textLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel2.setForeground(Color.white);
        textLabel2.setBounds(740, 280, 400, 350);
        backgroundPanel.add(textLabel2);

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
            DropTail page = new DropTail();
            page.setVisible(true);
        });
    }
}
