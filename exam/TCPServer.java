package exam;
import java.net.*;
import java.io.*;
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(1234);
            Socket as;
            as=ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(as.getInputStream()));
            String msg;

            while((msg=in.readLine())!=null){
                if(msg.equals("quit")){
                    break;
                }
                System.out.println("client : "+msg);
            }
            ss.close();
            as.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
