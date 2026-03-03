import java.util.*;
import java.net.*;

public class UDPClinet {
    public static void main(String[] args) {
       
        DatagramPacket dp = null,reply;
        DatagramSocket ds;
        InetAddress shost;
        try {
            ds = new DatagramSocket();
            shost = InetAddress.getByName("localhost");
            System.out.println("Enter a message");
            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            byte [] ms = msg.getBytes();
            dp = new DatagramPacket(ms,ms.length,shost,1234);
            ds.send(dp);
            byte [] buffer = new byte[1000];
            reply = new DatagramPacket(buffer,buffer.length);
            ds.receive(reply);
            System.out.println(new String(reply.getData(),0,reply.getLength()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
