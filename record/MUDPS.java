package record;
import java.net.*;

public class MUDPS {
    public static void main(String[] args){
        DatagramPacket dp = null;
        DatagramSocket ds;
        while(true){
            try{
                ds = new DatagramSocket(1234);
                byte [] buffer = new byte[1000];
                dp = new DatagramPacket(buffer,buffer.length);
                ds.receive(dp);

                new ClientHandler( dp, ds).start();
            }catch(Exception e){}
         }
    }
    
}

class ClientHandler extends Thread{
    DatagramPacket dp,reply;
    DatagramSocket ds;
    public ClientHandler(DatagramPacket dp , DatagramSocket ds){
        this.dp=dp;
        this.ds=ds;
    }
    public void run(){
        try{
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        String msg = new String(dp.getData(),0,dp.getLength());
        byte [] replyData = msg.getBytes();
        reply = new DatagramPacket(replyData,replyData.length,dp.getAddress(),dp.getPort());
        ds.send(reply);
        }catch(Exception e){}

    }
}