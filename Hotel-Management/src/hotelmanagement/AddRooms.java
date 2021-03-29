package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener {
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1, b2;

    AddRooms(){
        JLabel l1 = new JLabel("Add Rooms");
        l1.setFont(new Font("tahoma", Font.BOLD,20));
        l1.setBounds(150,25,120,20);
        add(l1);


        JLabel room = new JLabel("Room Number");
        room.setBounds(60,60,120,30);
        room.setFont(new Font("tahoma",Font.PLAIN,17));
        add(room);
        t1 = new JTextField();
        t1.setBounds(200,60,150,30);
        add(t1);

        JLabel available = new JLabel("Available");
        available.setBounds(60,100,120,30);
        available.setFont(new Font("tahoma",Font.PLAIN,17));
        add(available);
        c1 = new JComboBox(new String[] {"Available","Occupied"});
        c1.setBounds(200,100,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel cleaning = new JLabel("Cleaning Status");
        cleaning.setBounds(60,140,120,30);
        cleaning.setFont(new Font("tahoma",Font.PLAIN,17));
        add(cleaning);
        c2 = new JComboBox(new String[] {"Cleaned","Dirty"});
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,140,150,30);
        add(c2);

        JLabel price = new JLabel("Price");
        price.setBounds(60,180,120,30);
        price.setFont(new Font("tahoma",Font.PLAIN,17));
        add(price);
        t2 = new JTextField();
        t2.setBounds(200,180,150,30);
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setBounds(60,220,120,30);
        type.setFont(new Font("tahoma",Font.PLAIN,17));
        add(type);
        c3 = new JComboBox(new String[] {"single","Double"});
        c3.setBounds(200,220,150,30);
        c3.setBackground(Color.WHITE);
        add(c3);

        b1 = new JButton("Add Rooms");
        b1.setBounds(80,300,130,30);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Cancel");
        b2.setBounds(240,300,130,30);
        b2.addActionListener(this);
        add(b2);



//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagement/icons/fourth.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(2000,1000,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l4 = new JLabel(i3);
//        l4.setBounds(200,220,600,400);
//        add(l4);

        getContentPane().setBackground(Color.WHITE);//for background of the frame




        setBounds(400,150,500,500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String room = t1.getText();
            String available = (String)c1.getSelectedItem();
            String status = (String)c2.getSelectedItem();
            String price = t2.getText();
            String type = (String)c3.getSelectedItem();

            Conn c = new Conn();
            try{
                String str = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                c.s.executeUpdate(str);

                JOptionPane.showMessageDialog(null,"New Room Added");
                this.setVisible(false);

            }catch (Exception e){}


        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }
}
