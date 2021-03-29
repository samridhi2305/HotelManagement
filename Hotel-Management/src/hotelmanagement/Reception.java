package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {

    JButton b1, b2, b3,  b4, b5, b6, b7, b8, b9, b10, b11, b12;

    Reception(){
        b1 = new JButton("new Customer Form");
        b1.setBounds(80,20,200,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Room");
        b2.setBounds(80,60,200,30);
        b2.addActionListener(this);
        add(b2);

        b4 = new JButton("All Employee Info");
        b4.setBounds(80,100,200,30);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Customer Info");
        b5.setBounds(80,140,200,30);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("Manager Info");
        b6.setBounds(80,180,200,30);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("Check Out");
        b7.setBounds(80,220,200,30);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("Update Check Status");
        b8.setBounds(80,260,200,30);
        b8.addActionListener(this);
        add(b8);

//        b9 = new JButton("Update Room Status");
//        b9.setBounds(80,300,200,30);
//        b9.addActionListener(this);
//        add(b9);


        b11 = new JButton("Search Room");
        b11.setBounds(80,300,200,30);
        b11.addActionListener(this);
        add(b11);

        b12 = new JButton("LogOut");
        b12.setBounds(80,370,200,30);
        b12.addActionListener(this);
        add(b12);




        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(500,150,400,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == b1){
            new AddCustomer().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b2){
            new Room().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b3){

        }else if(ae.getSource() == b4){
            new EmployeeInfo().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b5){
            new CustomerInfo().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b6){
            new ManagerInfo().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b7){
            new CheckOut().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b8){
            new UpdateCheck().setVisible(true);
            this.setVisible(false);

//            }else if(ae.getSource() == b9) {
//            new UpdateRoom().setVisible(true);
//            this.setVisible(false);


//        }else if(ae.getSource() == b10){

        }else if(ae.getSource() == b11){
            new SearchRoom().setVisible(true);
            this.setVisible(false);

        }else if(ae.getSource() == b12){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Reception().setVisible(true);
    }


}
