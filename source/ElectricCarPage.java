package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class ElectricCarPage extends JFrame implements ActionListener {
    JButton backButton;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JLabel electricCarLabel;
    JLabel background;
    JLabel imageLabel1, imageLabel2, imageLabel3, imageLabel4, imageLabel5,
            imageLabel6, imageLabel7, imageLabel8, imageLabel9;

    public ElectricCarPage() {
        super("ELECTRIC CAR ");
        setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg2.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750);
        add(background);

        electricCarLabel = new JLabel("ELECTRIC CAR BRANDS");
        electricCarLabel.setFont(new Font("Arial", Font.BOLD, 30));
        electricCarLabel.setForeground(Color.decode("#FF0000"));
        electricCarLabel.setBounds(420, 50, 400, 30);
        background.add(electricCarLabel);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/telogo.jpg")));
        imageLabel1.setBounds(70, 140, 200, 150);
        background.add(imageLabel1);
        b1 = new JButton("TESLA");
        b1.setFont(new Font("Arial", Font.BOLD, 25));
        b1.setBounds(70, 290, 200, 50);
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        background.add(b1);

        imageLabel2 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/bmlogo.jpg")));
        imageLabel2.setBounds(350, 140, 200, 150);
        background.add(imageLabel2);
        b2 = new JButton("BMW");
        b2.setFont(new Font("Arial", Font.BOLD, 25));
        b2.setBounds(350, 290, 200, 50);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        background.add(b2);

        imageLabel3 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/fologo.jpg")));
        imageLabel3.setBounds(630, 140, 200, 150);
        background.add(imageLabel3);
        b3 = new JButton("FORD");
        b3.setFont(new Font("Arial", Font.BOLD, 25));
        b3.setBounds(630, 290, 200, 50);
        b3.setBackground(Color.decode("#1E90FF"));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        background.add(b3);

        imageLabel4 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/kalogo.jpg")));
        imageLabel4.setBounds(910, 140, 200, 150);
        background.add(imageLabel4);
        b4 = new JButton("KIA");
        b4.setFont(new Font("Arial", Font.BOLD, 25));
        b4.setBounds(910, 290, 200, 50);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        background.add(b4);

        imageLabel5 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/xilogo.jpg")));
        imageLabel5.setBounds(350, 400, 200, 150);
        background.add(imageLabel5);
        b5 = new JButton("XIAOMI");
        b5.setFont(new Font("Arial", Font.BOLD, 25));
        b5.setBounds(350, 550, 200, 50);
        b5.setBackground(Color.decode("#FF6900"));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        background.add(b5);

        imageLabel6 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/nilogo.jpg")));
        imageLabel6.setBounds(910, 400, 200, 150);
        background.add(imageLabel6);
        b6 = new JButton("NISSAN");
        b6.setFont(new Font("Arial", Font.BOLD, 25));
        b6.setBounds(910, 550, 200, 50);
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.RED);
        b6.addActionListener(this);
        background.add(b6);

        imageLabel7 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/aulogo.jpg")));
        imageLabel7.setBounds(70, 400, 200, 150);
        background.add(imageLabel7);
        b7 = new JButton("AUDI");
        b7.setFont(new Font("Arial", Font.BOLD, 25));
        b7.setBounds(70, 550, 200, 50);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.white);
        b7.addActionListener(this);
        background.add(b7);

        imageLabel8 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/aslogo.jpg")));
        imageLabel8.setBounds(630, 400, 200, 150);
        background.add(imageLabel8);
        b8 = new JButton("ASPARK");
        b8.setFont(new Font("Arial", Font.BOLD, 25));
        b8.setBounds(630, 550, 200, 50);
        b8.setBackground(Color.decode("#1E90FF"));
        b8.setForeground(Color.white);
        b8.addActionListener(this);
        background.add(b8);

        backButton = new JButton("←");
        backButton.setFont(new Font("Arial", Font.BOLD, 25));
        backButton.setBounds(20, 20, 70, 25);
        backButton.addActionListener(this);
        background.add(backButton);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            TESLA t = new TESLA();
            t.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b2) {
            BMW t1 = new BMW();
            t1.setVisible(true);
            this.dispose();;
        }
        else if (ae.getSource() == b3) {
            FORD t2 = new FORD();
            t2.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b4) {
            KIA t3 = new KIA();
            t3.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b5) {
            XIAOMI t4 = new XIAOMI();
            t4.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b6) {
            NISSAN t5 = new NISSAN();
            t5.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b7) {
            AUDI t6 = new AUDI();
            t6.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource() == b8) {
            ASPARK t7 = new ASPARK();
            t7.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == backButton) {
            CarListingPage carListingPage = new CarListingPage();
            carListingPage.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        ElectricCarPage electricCarPage = new ElectricCarPage();
        electricCarPage.setVisible(true);
    }
}
