package source;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UserData extends JFrame implements  ActionListener{
    JPanel panel;
    JLabel nameLabel,emailLabel,uperLabel ,passLabel,dtLabel;
    JTextField nameTF,emailTF,dtTF;
    JPasswordField passTF;
    JButton addBtn, backBtn,removeBtn;
    Font myFont, myFont2,myFont3;
    DefaultTableModel model;
    JScrollPane scroll;
    Color myColor1;
    JTable table;
    private String[] column = { "User Name", "Password", "Email", "Date and Time" };
    private String[] rows = new String[7];


    public UserData(){
        super("UserData");
        this.setSize(1200,710);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        myColor1 = new Color(0,0,139);
        myFont = new Font("Cascadia Code",Font.BOLD, 12);
        myFont2 = new Font("Times New Roman",Font.PLAIN,16);
        myFont3 = new Font("Abadi",Font.BOLD,20);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor1);
        panel.setOpaque (false);
        this.add (panel);


        uperLabel = new JLabel("User Data");
        uperLabel.setBounds(480,60,260,40);
        uperLabel.setForeground(Color.BLACK);
        uperLabel.setFont(myFont3);
        panel.add(uperLabel);


        addBtn = new JButton("Add");
        addBtn.setBounds(270,540,120 , 40);
        addBtn.setBackground(Color.ORANGE);
        addBtn.setForeground(Color.BLACK);
        addBtn.setOpaque(true);
        addBtn.addActionListener(this);
        panel.add(addBtn);

        removeBtn = new JButton("Remove");
        removeBtn.setBounds(500,540, 120, 40);
        removeBtn.setBackground(Color.ORANGE);
        removeBtn.setForeground(Color.BLACK);
        removeBtn.setOpaque(true);
        removeBtn.addActionListener(this);
        panel.add(removeBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(760,540, 70, 40);
        backBtn.setBackground(Color.ORANGE);
        backBtn.setForeground(Color.BLACK);
        backBtn.addActionListener(this);
        backBtn.setOpaque(true);
        panel.add(backBtn);

        table = new JTable ();

        model = new DefaultTableModel ();
        model.setColumnIdentifiers (column);

        table.setModel(model);
        table.setFont (myFont);
        table.setSelectionBackground (Color.GREEN);
        table.setRowHeight (30);
        table.setEnabled (true);
        table.addMouseListener(new MouseAdapter(){

            public void mouseClicked (MouseEvent me){
                int n = table.getSelectedRow ();
                String name = model.getValueAt (n,0).toString ();
                String password = model.getValueAt (n,1).toString ();
                String email = model.getValueAt (n,2).toString ();
                String date = model.getValueAt (n,5).toString ();

                nameTF.setText(name);
                passTF.setText(password);
                dtTF.setText(date);
                emailTF.setText(email);

            }

        });


        scroll = new JScrollPane (table);
        scroll.setBounds (240,130,620,400);
        panel.add (scroll);

        this.add(panel);
        this.setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if(backBtn.getText().equals(command)){
            AdminLogin lg = new AdminLogin ();
            lg.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == addBtn){
            AdminAdd frame = new AdminAdd();
            this.setVisible(false);
            frame.setVisible(true);
            this.dispose();
        }
        else if (ae.getSource()==removeBtn){

            int n = table.getSelectedRow();
            if (n>=0){
                model.removeRow(n);
            }else {
                JOptionPane.showMessageDialog(null,"no row has been selected or no row exits");
            }}
        else if (ae.getSource() == backBtn) {
            AdminLogin a = new AdminLogin();
            this.setVisible(false);
            a.setVisible(true);
            this.dispose();
        }
    }
}
