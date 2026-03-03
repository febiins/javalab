import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args) {
       ServerSocket ss;
       Socket cs;
       try{
            ss = new ServerSocket(1234);
            cs=ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            String msg = in.readLine();
            System.out.println(msg);
            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
            out.println(msg);
            out.close();

       }catch(Exception e){}
        
    }
    
}
