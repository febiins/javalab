import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args) {
        
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is connected");
            while(true){
                Socket cs = ss.accept();
                System.out.println("client connection is established");
                new ClientHandler (cs).start();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}

class ClientHandler extends Thread{
    Socket socket;
   public ClientHandler(Socket ss){
        socket = ss;
   }
   public void run(){
   try{
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        String msg=null;
        while(true){
            if(msg.equals("quit")){
                break;
            }
            System.out.println("client :"+msg);
        }
   }catch(Exception e){
    System.out.println(e);
   }
   }
}
