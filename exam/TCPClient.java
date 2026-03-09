package exam;

import java.net.Socket;
import java.util.Scanner;
import java.io.*;
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket cs = new Socket("localhost",1234);
            PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);

            while(true){
                String msg = sc.nextLine();
                out.println(msg);
                if(msg.equals("quit")){
                    break;
                }

            }
            cs.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
