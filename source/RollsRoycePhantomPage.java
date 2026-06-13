package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class RollsRoycePhantomPage extends JFrame implements ActionListener {
    JButton backButton, shopNowButton;

    public RollsRoycePhantomPage() {
        super("Rolls Royce Phantom");
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

        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/car30.jpg")));
        label.setBounds(420, 40, 330, 220);
        backgroundPanel.add(label);



        JLabel textLabel = new JLabel(" The Phantom");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setForeground(Color.black);
        textLabel.setBounds(520, 260, 200, 30);
        backgroundPanel.add(textLabel);

        JLabel textLabel0 = new JLabel("DETAILS:");
        textLabel0.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel0.setForeground(Color.black);
        textLabel0.setBounds(200, 290, 300, 30);
        backgroundPanel.add(textLabel0);

        JLabel textLabel1 = new JLabel("<html><body><b>Engine:<b><br>Type: Twin-turbocharged V12<br>Displacement: 6.75 liters<br>Horsepower: 563 bhp @ 5000 rpm<br>Torque: 900 Nm @ 1700 rpm<br>Transmission: Automatic<br>Drivetrain: Rear-wheel drive<br>Dimensions<br>Length: 5,982 mm (235.7 in)</body></html>");
        textLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel1.setForeground(Color.white);
        textLabel1.setBounds(200, 280, 400, 350);
        backgroundPanel.add(textLabel1);

        JLabel textLabel2 = new JLabel("<html><body>Width: 2,018 mm (79.4 in)<br>Height: 1,656 mm (65.2 in)<br>Wheelbase: 3,772 mm (148.5 in)<br>Curb weight: 2,560 kg (5,644 lb)<br>Fuel economy: 9.8 kmpl (12.2 mpg)<br>Seating capacity: 5<br>Cargo capacity: 460 liters (16.2 cu ft)<br>Top speed: 250 km/h (155 mph)<br>Price: $505,750</body></html>");
        textLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel2.setForeground(Color.white);
        textLabel2.setBounds(740, 280, 400, 350);
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
            RollsRoycePhantomPage page = new RollsRoycePhantomPage();
            page.setVisible(true);
        });
    }
}
