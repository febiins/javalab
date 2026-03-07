package record;
import java.net.*;
import java.util.*;
import java.io.*;
public class TCPClient {
    public static void main (String []args){
        Socket cs;
        try{
            cs = new Socket("localhost",1234);
            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            String reply = in.readLine();
            System.out.println(reply);
        }catch(Exception e){}
    }
    
}
