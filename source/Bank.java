package source;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

class Bank extends JFrame implements ActionListener {
    JButton backButton,b1,b2;
	JLabel p,p1,background;
	JTextField cn,ex,cvc,chn;

    public Bank() {
        super("Bank");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/ALL IMAGES/bank.png"));
        background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1200, 710); 
        this.add(background);
		
		p = new JLabel("Enter your paymet details");
        p.setFont(new Font("Arial", Font.PLAIN, 30));
        p.setForeground(Color.black);
        p.setBounds(400, 70, 400, 30);
        background.add(p);
		
		p1 = new JLabel("Enter Card Number:");
        p1.setFont(new Font("Arial", Font.PLAIN, 17));
        p1.setForeground(Color.black);
        p1.setBounds(340,200, 150, 19);
        background.add(p1);
		
		cn = new JTextField();
		cn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cn.setOpaque(false);
		cn.setBounds(500, 190, 280, 40);
		background.add(cn);
		
		p1 = new JLabel("MM/YY:");
        p1.setFont(new Font("Arial", Font.PLAIN, 17));
        p1.setForeground(Color.black);
        p1.setBounds(340,250, 150, 19);
        background.add(p1);
		
		ex = new JTextField();
		ex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ex.setOpaque(false);
		ex.setBounds(410, 240, 130, 40);
		background.add(ex);
		
		p1 = new JLabel("CVC/CVV:");
        p1.setFont(new Font("Arial", Font.PLAIN, 17));
        p1.setForeground(Color.black);
        p1.setBounds(560,250, 150, 19);
        background.add(p1);
		
		cvc = new JTextField();
		cvc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cvc.setOpaque(false);
		cvc.setBounds(650, 240, 130, 40);
		background.add(cvc);
		
		p1 = new JLabel("Card Holder Name:");
        p1.setFont(new Font("Arial", Font.PLAIN, 17));
        p1.setForeground(Color.black);
        p1.setBounds(340,300, 150, 19);
        background.add(p1);
		
		chn = new JTextField();
		chn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chn.setOpaque(false);
		chn.setBounds(500, 290, 280, 40);
		background.add(chn);
		
		b1 = new JButton("Procced");
		b1.setBounds(400, 380,130,40);
		b1.setBorder(null);
		b1.setFont(new Font("Algreya", Font.BOLD, 18));
		b1.setForeground(new Color(25, 118, 211));
		b1.setBackground(new Color(255, 255, 255));
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1.addActionListener(this);
		background.add(b1);

		b2 = new JButton();
		b2.setText("Cancel");
		b2.setBounds(600,380,130,40);
		b2.setBorder(null);
		b2.setFont(new Font("Algreya", Font.BOLD, 18));
		b2.setForeground(new Color(255,0,0 ));
		b2.setBackground(new Color(255, 255, 255));
		b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2.addActionListener(this);
		background.add(b2);

		b1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				b1.setBackground(new Color(25, 118, 211));
				b1.setForeground(new Color(255, 255, 255));
			}

			public void mouseExited(MouseEvent e) {
				b1.setForeground(new Color(25, 118, 211));
				b1.setBackground(new Color(255, 255, 255));
			}
		});

		b2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				b2.setBackground(new Color(255,0,0));
				b2.setForeground(new Color(255, 255, 255));
			}

			public void mouseExited(MouseEvent e) {
				b2.setForeground(new Color(255, 0,0));
				b2.setBackground(new Color(255, 255, 255));
			}
		});

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBounds(20, 20, 90, 25); 
        backButton.addActionListener(this);
        background.add(backButton);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            payment f = new payment();
			this.setVisible(false);
            f.setVisible(true);
        }
		else if (ae.getSource() == b1) {
            if (cn.getText().equals("") || ex.getText().equals("") || cvc.getText().equals("") || chn.getText().equals("")) {
                showMessageDialog(null, " You need to fill all information", "Message",-1);
			}

			else {
				showMessageDialog(null, "Payment Complete", "Thank You", -1);
                    this.setVisible(false);
			}
		}
		else if (ae.getSource() == b2){
            this.setVisible(false);
		}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Bank b = new Bank();
            b.setVisible(true);
        });
    }
}
