import java.net.*;
import java.util.*;

public class UDPServer {
    public static void main(String[] args) {
        
        DatagramSocket ds=null;
        DatagramPacket dp = null,reply;
        try {
            ds = new DatagramSocket(1234);
            byte [] buffer =new byte[1000];
            dp = new DatagramPacket(buffer,buffer.length);
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
            reply = new DatagramPacket(buffer,buffer.length,dp.getAddress(),dp.getPort());
            ds.send(reply);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
