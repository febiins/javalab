package record;

/*
Program to implement one-one chatting.

@Febin Sunny
Roll No:27
  
 */

import java.net.*;
import java.io.*;


class ServerRecive extends Thread{
    private Socket socket;
    public ServerRecive(Socket socket){
        this.socket=socket;
    }
    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg;
            while((msg=in.readLine())!=null){
                System.out.println("client: "+msg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class CServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server waiting for client...");
            Socket as = ss.accept();

            ServerRecive obj = new ServerRecive(as);
            obj.start();

            PrintWriter out = new PrintWriter(as.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String msg;

            while((msg=in.readLine())!=null){
                out.println(msg);
            }
            ss.close();
            as.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
