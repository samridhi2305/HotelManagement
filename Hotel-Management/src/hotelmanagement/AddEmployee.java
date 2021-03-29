package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
JTextField t1,t2,t3,t4,t5,t6;
JRadioButton r1,r2;
JComboBox c1;
JButton b1,b2;
    public AddEmployee(){
        //NAME
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("tahoma",Font.PLAIN,17));
        name.setBounds(60,50,120,30);
        add(name);
        t1 = new JTextField();
        t1.setBounds(150,50,150,30);
        add(t1);
        //AGE
        JLabel age = new JLabel("AGE");
        age.setFont(new Font("tahoma",Font.PLAIN,17));
        age.setBounds(60,85,120,30);
        add(age);
        t2 = new JTextField();
        t2.setBounds(150,85,150,30);
        add(t2);
        //GENDER
        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("tahoma",Font.PLAIN,17));
        gender.setBounds(60,115,120,30);
        add(gender);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.PLAIN,14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(150,115,60,30);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.PLAIN,14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(210,115,70,30);
        add(r2);
        //JOB
        JLabel job = new JLabel("JOB");
        job.setFont(new Font("tahoma",Font.PLAIN,17));
        job.setBounds(60,150,120,30);

        add(job);
        String str[] = {"Front Desk Cerks","Porters","HouseKeeping","Kitchen Staff","Room Service","Waiter/Witress","Manager","Accountant","Chef"};
        c1 = new JComboBox(str);
        c1.setBounds(150,150,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);

        //SALARY
        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("tahoma",Font.PLAIN,17));
        salary.setBounds(60,185,120,30);
        add(salary);
        t3 = new JTextField();
        t3.setBounds(150,185,150,30);
        add(t3);
        //PHONE
        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("tahoma",Font.PLAIN,17));
        phone.setBounds(60,220,120,30);
        add(phone);
        t4 = new JTextField();
        t4.setBounds(150,220,150,30);
        add(t4);
        //AADHAR
        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font("tahoma",Font.PLAIN,17));
        aadhar.setBounds(60,255,120,30);
        add(aadhar);
        t5 = new JTextField();
        t5.setBounds(150,255,150,30);
        add(t5);
        //EMAIL
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("tahoma",Font.PLAIN,17));
        email.setBounds(60,290,120,30);
        add(email);
        t6 = new JTextField();
        t6.setBounds(150,290,150,30);
        add(t6);
        //BUTTON
        b1 = new JButton("Submit");
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
        b1.setBounds(150,325,150,30);
        b1.addActionListener(this);
        add(b1);

//        b2 = new JButton("Cancel");
//        b2.setBounds(310,325,150,30);
//        b2.addActionListener(this);
//        add(b2);




        //Image to be inserted
        ImageIcon i1 = new ImageIcon((ClassLoader.getSystemResource("")));
        //LABEL
        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLUE);
        l2.setBounds(140,2,700,30);
        l2.setFont(new Font ("Tahoma",Font.PLAIN,30));
        add(l2);

        getContentPane().setBackground(Color.WHITE);


        setLayout(null);
        setBounds(400,200,600,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String aadhar = t5.getText();
        String email = t6.getText();

        String gender = null;
        if(r1.isSelected()) {
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "female";
        }

        String job = (String)c1.getSelectedItem();
        Conn c  = new Conn();
        String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
        try{
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"New Employee Added");
            this.setVisible(false);

        }catch (Exception e){
            System.out.println(e);

        }



        }






    public static void main(String[] args) {
        new AddEmployee().setVisible(true);
    }
}
