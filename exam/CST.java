package exam;

import java.sql.*;
import java.util.*;

/*
//insert
create or replace procedure deptinsert(deptid number,depname varchar2)
as
begin
	insert into department values(deptid,depname);
end;
/

create or replace procedure empinsert(empid number,empname varchar2,deptid number)
as
begin
	insert into employee values(empid,empname,deptid);
end;
/
-----------------------------------------------------------------------
//update
create or replace procedure empupdate(id number,empnam varchar2)
as
begin
 	update employee set empname=empnam where empid=id;
end;
/

//delete
create or replace procedure empdel(id number)
as
begin
	delete from employee where empid=id;
end;
/
   
*/
public class CST {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");

            CallableStatement cst1 = con.prepareCall("{call deptinsert(?,?)}");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter department id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter department name");
            String name = sc.nextLine();

            cst1.setInt(1,id);
            cst1.setString(2,name);
            cst1.execute();

            CallableStatement cst2=con.prepareCall("{call empinsert(?,?,?)}");
            System.out.println("Enter emp id:");
            int eid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter emp name");
            String ename = sc.nextLine();

            cst2.setInt(1,eid);
            cst2.setString(2,ename);
            cst2.setInt(3,id);
            cst2.execute();

            //update

            CallableStatement cst3 = con.prepareCall("{call empupdate(?,?)}");
            System.out.println("Enter emp id to update");
            int uid=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the new name");
            String newname=sc.nextLine();

            cst3.setInt(1,uid);
            cst3.setString(2,newname);
            cst3.execute();

            //delete
            CallableStatement cst4=con.prepareCall("{call empdel(?)}");
            System.out.println("Enter emp id to delete");
            int did=sc.nextInt();
            cst4.setInt(1,did);
            cst4.execute();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
