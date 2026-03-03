import java.sql.*;
import java.util.*;

public class DBC {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");
            CallableStatement cst = con.prepareCall("{call demoinsert(?,?,?)}");
            cst.setInt(1,4);
            cst.setString(2,"feb");
            cst.setInt(3,400);
            int i = cst.executeUpdate();
            System.out.print(i);
        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }
    
}
