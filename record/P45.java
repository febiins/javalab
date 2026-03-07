package record;
//udps
import java.io.*;
import java.net.*;

public class P45{

	public static void main(String[] args){

		DatagramSocket ds = null;
		InetAddress shost = null;
		DatagramPacket dp = null, reply =null;
		try{
			ds = new DatagramSocket();
			byte [] m= "bye".getBytes();

			shost = InetAddress.getByName("localhost");
			dp = new DatagramPacket(m,3,shost,1234);
			ds.send(dp);
			byte[] buffer = new byte[1000];
			reply = new DatagramPacket(buffer,buffer.length);
			ds.receive(reply);
			System.out.println("Reply :"+(new String(reply.getData())).trim()); 
		}catch(Exception e){}
	}
}