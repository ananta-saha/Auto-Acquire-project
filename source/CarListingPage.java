package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class CarListingPage extends JFrame implements ActionListener {
    JButton backButton, electricCarButton, dieselCarButton;
    JLabel chooseTypeLabel, background;
    ImageIcon electricCarImage, dieselCarImage;

    public CarListingPage() {
        super("CAR LISTING");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/carlist.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750);
        this.add(background);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        chooseTypeLabel = new JLabel("WHAT TYPE ARE YOU LOOKING FOR?");
        chooseTypeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        chooseTypeLabel.setForeground(Color.black);
        chooseTypeLabel.setBounds(320, 140, 600, 30);
        background.add(chooseTypeLabel);

        electricCarButton = new JButton("ELECTRIC CAR");
        electricCarButton.setFont(new Font("Arial", Font.BOLD, 25));
        electricCarButton.setBounds(470, 230, 250, 50);
        electricCarButton.setBackground(Color.red);
        electricCarButton.setForeground(Color.white);
        electricCarButton.addActionListener(this);
        background.add(electricCarButton);

        dieselCarButton = new JButton("DIESEL CAR");
        dieselCarButton.setFont(new Font("Arial", Font.BOLD, 25));
        dieselCarButton.setBounds(470, 330, 250, 50);
        dieselCarButton.setBackground(Color.blue);
        dieselCarButton.setForeground(Color.white);
        dieselCarButton.addActionListener(this);
        background.add(dieselCarButton);

        backButton = new JButton("←");
        backButton.setFont(new Font("Arial", Font.BOLD, 25));
        backButton.setBounds(20, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == backButton) {
            Home form1 = new Home();
            this.dispose();
            form1.setVisible(true);
        } else if(ae.getSource() == electricCarButton) {
            ElectricCarPage electricCarPage = new ElectricCarPage();
            electricCarPage.setVisible(true);
            this.dispose();
        } else if(ae.getSource() == dieselCarButton) {
            DieselCarPage dieselCarPage = new DieselCarPage();
            dieselCarPage.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
    }
}
