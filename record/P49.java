package record;
import java.util.*;
import java.sql.*;

public class P49 {
    public static void main(String[] args) {
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("oracle.jdbc.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");
            PreparedStatement pst = con.prepareStatement("insert into demo values (?, ?, ?)");
            pst.setInt(1,2);
            pst.setString(2,"sunny");
            pst.setInt(3,300);
            int i = pst.executeUpdate();
            System.out.println(i+" records inserted"); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
    
}
