package hotelmanagement;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame implements ActionListener {

    JTable t1;
    JButton b1,b2;
    Room(){
        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(10,10,100,20);
        add(l1);
        JLabel l2 = new JLabel("Availability");
        l2.setBounds(170,10,100,20);
        add(l2);
        JLabel l3 = new JLabel("Status");
        l3.setBounds(330,10,100,20);
        add(l3);
        JLabel l4 = new JLabel("Price");
        l4.setBounds(490,10,100,20);
        add(l4);
        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(650,10,100,20);
        add(l5);

        t1 = new JTable();
        t1.setBounds(0,40,800,350);
        add(t1);
        b1 = new JButton("Load Data");
        b1.setBounds(200,410,120,30);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Back");
        b2.setBounds(370,410,120,30);
        b2.addActionListener(this);
        add(b2);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(350,150,800,500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                Conn c = new Conn();
                String str = "select * from room";
                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));

            }catch (Exception e){

            }

        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Room().setVisible(true);

    }
}
