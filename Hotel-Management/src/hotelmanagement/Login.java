package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {
        l1 = new JLabel("Username");
        //Username keyword
        l1.setBounds(40, 20, 100, 30);
        add(l1);
        l2 = new JLabel("Password");
        //Password keyword
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t1 = new JTextField();
        //Username TextField
        t1.setBounds(130, 20, 150, 30);
        add(t1);

        t2 = new JPasswordField();
        //Password TextField
        t2.setBounds(130, 70, 150, 30);
        add(t2);
        //Login Buttom
        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40, 120, 150, 30);
        b1.addActionListener(this);
        add(b1);

        //Cancel Button
        b2 = new JButton("Cancel");
        b2.setBounds(200, 120, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setLayout(null);
        //BOX
        setBounds(500, 200, 500, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String username = t1.getText();
            String password = t2.getText();
            Conn c = new Conn();

            String str = "select * from login where username =  '" + username + "' and password = '" + password + "'";//making a mysql query
            try {

                ResultSet rs = c.s.executeQuery(str);

                //false because we are closing
                if (rs.next()) {
                    new Dashboard().setVisible(true);

                } else {//pop up

                    JOptionPane.showMessageDialog(null, "invalid username and password");
                }
                this.setVisible(false);

            } catch (Exception e) {
            }

        } else if (ae.getSource() == b2) {
            System.out.println("123");
            System.exit(0);

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

