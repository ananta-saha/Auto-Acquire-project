package source;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

class DieselCarPage extends JFrame implements ActionListener {
    JButton backButton;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JLabel dieselCarLabel, background;
    JLabel imageLabel1;

    public DieselCarPage() {
        super("DIESEL CAR");
        setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bg2.jpg"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 750);
        add(background);

        dieselCarLabel = new JLabel("DIESEL CAR BRANDS");
        dieselCarLabel.setFont(new Font("Arial", Font.BOLD, 30));
        dieselCarLabel.setForeground(Color.BLUE);
        dieselCarLabel.setBounds(440, 50, 400, 30);
        background.add(dieselCarLabel);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/rologo.jpg")));
        imageLabel1.setBounds(70, 140, 200, 150);
        background.add(imageLabel1);
        b1 = new JButton("ROLLS-ROYCE");
        b1.setFont(new Font("Arial", Font.BOLD, 22));
        b1.setBounds(70, 290, 200, 50);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        background.add(b1);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/felogo.jpg")));
        imageLabel1.setBounds(350, 140, 200, 150);
        background.add(imageLabel1);
        b2 = new JButton("FERRARI");
        b2.setFont(new Font("Arial", Font.BOLD, 25));
        b2.setBounds(350, 290, 200, 50);
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        background.add(b2);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/lalogo.jpg")));
        imageLabel1.setBounds(630, 140, 200, 150);
        background.add(imageLabel1);
        b3 = new JButton("LAMBORGHINI");
        b3.setFont(new Font("Arial", Font.BOLD, 22));
        b3.setBounds(630, 290, 200, 50);
        b3.setBackground(Color.black);
        b3.setForeground(Color.yellow);
        b3.addActionListener(this);
        background.add(b3);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/pologo.jpg")));
        imageLabel1.setBounds(910, 140, 200, 150);
        background.add(imageLabel1);
        b4 = new JButton("PORSCHE");
        b4.setFont(new Font("Arial", Font.BOLD, 25));
        b4.setBounds(910, 290, 200, 50);
        b4.setBackground(Color.decode("#6495ED"));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        background.add(b4);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/bulogo.jpg")));
        imageLabel1.setBounds(350, 400, 200, 150);
        background.add(imageLabel1);
        b5 = new JButton("BUGATTI");
        b5.setFont(new Font("Arial", Font.BOLD, 25));
        b5.setBounds(350, 550, 200, 50);
        b5.setBackground(Color.red);
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        background.add(b5);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/malogo.jpg")));
        imageLabel1.setBounds(630, 400, 200, 150);
        background.add(imageLabel1);
        b6 = new JButton("McLAREN");
        b6.setFont(new Font("Arial", Font.BOLD, 25));
        b6.setBounds(630, 550, 200, 50);
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        background.add(b6);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/belogo.jpg")));
        imageLabel1.setBounds(70, 400, 200, 150);
        background.add(imageLabel1);
        b8 = new JButton("BENTLEY");
        b8.setFont(new Font("Arial", Font.BOLD, 25));
        b8.setBounds(70, 550, 200, 50);
        b8.setBackground(Color.white);
        b8.setForeground(Color.black);
        b8.addActionListener(this);
        background.add(b8);

        imageLabel1 = new JLabel(new ImageIcon(getClass().getResource("/ALL IMAGES/melogo.jpg")));
        imageLabel1.setBounds(910, 400, 200, 150);
        background.add(imageLabel1);
        b9 = new JButton("MERCEDES");
        b9.setFont(new Font("Arial", Font.BOLD, 25));
        b9.setBounds(910, 550, 200, 50);
        b9.setBackground(Color.black);
        b9.setForeground(Color.white);
        b9.addActionListener(this);
        background.add(b9);

        backButton = new JButton("←");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(20, 20, 90, 25);
        backButton.addActionListener(this);
        background.add(backButton);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == backButton) {
            CarListingPage carListingPage = new CarListingPage();
            carListingPage.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b1){
            ROLLS_ROYCE r1=new ROLLS_ROYCE();
            r1.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b2){
            FERRARI r2=new FERRARI();
            r2.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b3){
            LAMBORGHINI r3=new LAMBORGHINI();
            r3.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b4){
            PORSCHE r4=new PORSCHE();
            r4.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b5){
            BUGATTI r5=new BUGATTI();
            r5.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b6){
            McLAREN r6=new McLAREN();
            r6.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b8){
            BENTLEY r8=new BENTLEY();
            r8.setVisible(true);
            this.dispose();
        }
        else if(ae.getSource() == b9){
            MERCEDES r9=new MERCEDES();
            r9.setVisible(true);
            this.dispose();
        }
    }
    public static void main(String[] args) {
        DieselCarPage dieselCarPage = new DieselCarPage();
        dieselCarPage.setVisible(true);
    }
}
