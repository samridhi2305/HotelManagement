package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;

    public Dashboard(){
        mb = new JMenuBar();
        add(mb);

        m1 = new JMenu("Hotel Management");
        mb.add(m1);

        m2 = new JMenu("Admin");
        mb.add(m2);

        i1 = new JMenuItem("Reception");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("Add Employee");
        i2.addActionListener(this);
        m2.add(i2);

        i3 = new JMenuItem("Add Rooms");
        i3.addActionListener(this);
        m2.add(i3);

        mb.setBounds(0,0,1950,30);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(2000,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1700,1000);
        add(l1);

        JLabel l2 = new JLabel("ATLANTIS HOTEL WELCOMES YOU");
        l2.setBounds(300,50,800,50);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("tahoma",Font.PLAIN,50));
        l1.add(l2);


        setLayout(null);
        setBounds(0,0,1380,1000);
        setVisible(true);





    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Reception")){
            new Reception().setVisible(true);
        }else if(ae.getActionCommand().equals("Add Employee")){
            new AddEmployee().setVisible(true);
        }else if(ae.getActionCommand().equals("Add Rooms")){
            new AddRooms().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);

    }
}
