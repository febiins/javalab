/*
Program to implement one-one chatting.

@Febin Sunny
Roll No:27
  
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileDownloadServer {
     public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server started... Waiting for client");

            Socket socket = ss.accept();
            System.out.println("Client connected");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Receive file name from client
            String filename = dis.readUTF();

            String serverPath = "D:\\severuplod\\";   // Server folder
            File file = new File(serverPath + filename);

            if (file.exists()) {

                dos.writeBoolean(true); // File exists
                FileInputStream fis = new FileInputStream(file);

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = fis.read(buffer)) > 0) {
                    dos.write(buffer, 0, bytesRead);
                }

                fis.close();
                System.out.println("File sent successfully");

            } else {
                dos.writeBoolean(false); // File not found
                System.out.println("File not found");
            }

            socket.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
