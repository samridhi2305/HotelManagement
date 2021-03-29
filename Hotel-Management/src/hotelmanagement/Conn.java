package hotelmanagement;


import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//register
            c = DriverManager.getConnection("jdbc:mysql:///projecthms", "root", "12345");//create
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


