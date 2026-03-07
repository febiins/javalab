import java.sql.*;


public class P53{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","febin","febin");

            con.setAutoCommit(false);  
            //transaction
		    Statement stmt=con.createStatement();  
		    stmt.executeUpdate("insert into auth values('vimal','vimal')");  
		    stmt.executeUpdate("insert into auth values('akhil','akhil')");  
  
            //batch
            stmt.addBatch("insert into auth values('alex','alex')");  
		    stmt.addBatch("insert into auth values('bibin','bibin')");  
  		    stmt.executeBatch();
		    con.commit(); 
            
            ResultSet rs = stmt.executeQuery("select * from auth");

            System.out.println("Username\tPassword");
            System.out.println("-----------------------");

            while (rs.next()) {
                String username = rs.getString(1);
                String password = rs.getString(2);

                System.out.println(username + "\t\t" + password);
            }

		    con.close();  

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}


