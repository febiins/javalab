package exam;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramPacket dp=null,reply;
            DatagramSocket ds;
            ds=new DatagramSocket(1234);
            byte r[]=new byte[1000];
            dp=new DatagramPacket(r,r.length);
            ds.receive(dp);

            String msg = new String(dp.getData(),0,dp.getLength());
            System.out.println("client :" +msg);
            reply=new DatagramPacket(r, r.length,dp.getAddress(),dp.getPort());
            ds.send(reply);


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
