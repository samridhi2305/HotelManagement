package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//awt package mai event package ko import karwane h.Action Listener is under event.*
//ActionListener interface is used to connect 2 windows.
public class HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem(){
        //FRAME
        setBounds(500,200,550,367);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagement/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        //BACKGROUND IMAGE
        l1.setBounds(0,0,550,367);
        add(l1);
        JLabel l2 = new JLabel("Hotel Management System");
        //TEXT SIZE
        l2.setBounds(10,270,400,70);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN,30));
        l1.add(l2);
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        //BUTTON

        b1.setBounds(450,290,65,25);
        b1.addActionListener(this);
        l1.add(b1);


        setLayout(null);//layout means kis tarah componenets place hoge,,bottle layout is defaulft layout
        setVisible(true);


    }
    //Overriding the methods in interface "ActionListener"
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        //to close the previous window
        //here this is the object of current class
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }

}
