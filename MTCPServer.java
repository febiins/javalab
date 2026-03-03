import java.io.*;
import java.net.*;

public class MTCPServer {
    public static void main(String[] args) {   
        try {
            ServerSocket ss;
            Socket cs;
            ss=new ServerSocket(1234);
            while(true){
                cs = ss.accept();
                new Handler(cs).start();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Handler extends Thread{
    Socket cs;
    
    public Handler(Socket cs){
        
        this.cs=cs;
    }    
    public void run(){
        try{
        BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String msg = in.readLine();
        PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
        out.println(msg);
        out.close();
        }
        catch(Exception e){}
    }
}
