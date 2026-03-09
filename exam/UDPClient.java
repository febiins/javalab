package exam;

import java.net.*;
import java.util.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramPacket dp=null,reply;
            DatagramSocket ds;
            InetAddress host;
            
            ds= new DatagramSocket();
            host=InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the message to send");
            String msg = sc.nextLine();

            byte buffer[]=msg.getBytes();
            dp=new DatagramPacket(buffer,buffer.length,host,1234);
            ds.send(dp);

            byte ms[]=new byte[1000];
            reply = new DatagramPacket(ms, ms.length);
            ds.receive(reply);
            System.out.println("Server reply: " +new String(reply.getData(), 0, reply.getLength()));
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
