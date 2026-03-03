//uploadserver

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class P43 {
    public static void main(String[] args){
		try{
			Socket ss = new Socket("localhost",1234);
			FileInputStream fis;
			File file ;
			DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
			Scanner sc = new Scanner(System.in);

            System.out.print("Enter file path: ");
            String path = sc.nextLine();
			file = new File(path);
			fis = new FileInputStream(path);
			dos.writeUTF(file.getName());
			int ch;
			while((ch=fis.read())!=-1){
				dos.write(ch);
			}
			fis.close();
			dos.close();
			ss.close();
			System.out.println("File uploaded successfully..");

		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
