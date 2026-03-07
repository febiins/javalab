package record;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("oracle.jdbc.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");
            String username,password;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username");
            username=sc.nextLine().trim();
            
            System.out.println("Enter password");
            password=sc.nextLine().trim();
            PreparedStatement pst = con.prepareStatement("select * from auth where username=? and pass=?");
            
            pst.setString(1,username);
            pst.setString(2,password);
            ResultSet rs= pst.executeQuery();

            if(rs.next()){
                System.out.println("valid user");
            }else{
                System.out.println("invalid user");
            }
             
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
