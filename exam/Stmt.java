package exam;
import java.sql.*;
import java.util.*;
public class Stmt {
    public static void main(String[] args) {
        try {
             //Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
        
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");
            
            Statement st = con.createStatement();

            String table1="create table department(deptid number primary key,deptname varchar2(10))";
            String table2="create table employee(empid number primary key,empname varchar2(10),deptid number references department(deptid))";

            st.executeUpdate(table1);
            System.out.println("Department table created");
            st.executeUpdate(table2);

            Scanner sc = new Scanner(System.in);
            // INSERT OPERATION
            System.out.print("Enter Department ID: ");
            int deptid=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department Name: ");
            String deptname=sc.nextLine();

            String insertDept="insert into department values("+deptid+",'"+deptname+"')";
            st.executeUpdate(insertDept);

            System.out.print("Enter Employee ID: ");
            int empid=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empname=sc.nextLine();

            String insertemp="insert into employee values("+empid+",'"+empname+"',"+deptid+")";
            st.executeUpdate(insertemp);

            String read = "Select * from employee";
            ResultSet rs = st.executeQuery(read);

            //Read
            System.out.println("Employee details are:");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            //Update
            System.out.print("\nEnter Employee ID to Update: ");
            int uid=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Employee Name: ");
            String newname=sc.nextLine();

            String update = "update employee set empname='"+newname+"'where empid="+uid+"";
            st.executeUpdate(update);

            // DELETE OPERATION
            System.out.print("\nEnter Employee ID to Delete: ");
            int did=sc.nextInt();

            String delete = "delete from employee where empid="+did+"";
            st.executeUpdate(delete);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
       

    }
    
}
