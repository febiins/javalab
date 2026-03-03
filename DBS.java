import java.sql.*;
import java.util.*;

public class DBS {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");
            System.out.println("connection builded successfully");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id");
            int id =  sc.nextInt();
            sc.nextLine();
            System.out.println("Enter username");
            String username = sc.nextLine();
            System.out.println("Enter amount");
            int amt = sc.nextInt();
            Statement smt = con.createStatement();
            String sql = "insert into demo values("+id+",'"+username+"',"+amt+")";
            smt.executeUpdate(sql);

        } catch(Exception e){
            System.out.println(e);
        }   
    }
    
}
