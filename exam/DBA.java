package exam;

import java.sql.*;
import java.io.*;
public class DBA {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");

            String data ="8:abc";

            String [] part=data.split(":");

            int id = Integer.parseInt(part[0]);
            String name=part[1];

            PreparedStatement pst = con.prepareStatement("insert into department values(?,?)");
            pst.setInt(1,id);
            pst.setString(2,name);

            int i = pst.executeUpdate();

            System.out.println(i);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
