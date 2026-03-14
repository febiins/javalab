package exam;
import java.util.*;
import java.sql.*;
public class PST {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");

            String insert = "insert into department values(?,?)";
            PreparedStatement pst1 = con.prepareStatement(insert);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter department name");
            String name = sc.nextLine();

            pst1.setInt(1,id);
            pst1.setString(2,name);

            int i=pst1.executeUpdate();
            System.out.println("inserted" + i + "record");

            String insert2 = "insert into employee values(?,?,?)";
            PreparedStatement pst2 = con.prepareStatement(insert2);

            
            System.out.println("Enter emp id:");
            int eid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter emp name");
            String ename = sc.nextLine();

            pst2.setInt(1,eid);
            pst2.setString(2,ename);
            pst2.setInt(3,id);


            int j=pst2.executeUpdate();
            System.out.println("inserted" + j + "record");

            String sql="select * from employee";
            PreparedStatement pst3=con.prepareStatement(sql);
            ResultSet rs=pst3.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            //update

            String update="update employee set empname=? where empid=?";

            PreparedStatement pst4 = con.prepareStatement(update);

            System.out.println("Enter emp id to update");
            int uid=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the new name");
            String newname=sc.nextLine();

            pst4.setString(1,newname);
            pst4.setInt(2,uid);
            int k=pst4.executeUpdate();
            System.out.println("updated" + k + "record");

            //delete
            String delete ="delete from employee where empid =?";
            PreparedStatement pst5=con.prepareStatement(delete);
            System.out.println("Enter the id to delete");
            int did=sc.nextInt();

            pst5.setInt(1,did);
            int d = pst5.executeUpdate();
            System.out.println("deleted" + d + "record");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
