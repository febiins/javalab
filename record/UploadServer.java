package record;
import java.io.*;
import java.net.*;

public class UploadServer{
	public static void main(String [] args){
		try{
			ServerSocket ss = new ServerSocket(1234);
			Socket as = ss.accept();
			DataInputStream dis = new DataInputStream(as.getInputStream());
			String filename = dis.readUTF();
			String path="D:\\severuplod\\";
			FileOutputStream fos = new FileOutputStream(path+filename);
			int ch;
			while((ch=dis.read())!=-1){
				fos.write(ch);
			}
			
			fos.close();
			ss.close();
			System.out.println("File is uploaded");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
