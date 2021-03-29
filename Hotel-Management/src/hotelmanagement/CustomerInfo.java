package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class CustomerInfo  extends JFrame implements ActionListener {
    JTable t1;
    JButton b1, b2;

    CustomerInfo(){
        t1 = new JTable();
        t1.setBounds(0,40,1000,400);
        add(t1);

        JLabel l1 = new JLabel("Document Type");
        l1.setBounds(10,15,100,20);
        add(l1);
        JLabel l2 = new JLabel("Number");
        l2.setBounds(160,15,70,20);
        add(l2);
        JLabel l3 = new JLabel("Name");
        l3.setBounds(290,15,70,20);
        add(l3);
        JLabel l4 = new JLabel("Gender");
        l4.setBounds(410,15,70,20);
        add(l4);
        JLabel l5 = new JLabel("Country");
        l5.setBounds(540,15,70,20);
        add(l5);
        JLabel l6 = new JLabel("Room No.");
        l6.setBounds(640,15,100,20);
        add(l6);
        JLabel l7 = new JLabel("Status");
        l7.setBounds(790,15,70,20);
        add(l7);
        JLabel l8 = new JLabel("Deposit");
        l8.setBounds(900,15,70,20);
        add(l8);

        b1 = new JButton("load Data");
        b1.setBounds(350,460,120,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(530,460,120,30);
        b2.addActionListener(this);
        add(b2);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(200,100,1000,550);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                Conn c = new Conn();
                String str = "select * from customer";
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
        new CustomerInfo().setVisible(true);
    }
}
