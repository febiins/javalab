package record;
//filedownloadingserver

import java.io.*;
import java.net.*;
import java.util.*;

public class P42 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 1234);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);

            // Enter filename
            System.out.print("Enter file name to download: ");
            String filename = sc.nextLine();

            dos.writeUTF(filename);

            boolean fileExists = dis.readBoolean();

            if (fileExists) {

                String clientPath = "D:\\clientdownload\\";  // Client folder
                FileOutputStream fos = new FileOutputStream(clientPath + filename);

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = dis.read(buffer)) > 0) {
                    fos.write(buffer, 0, bytesRead);
                }

                fos.close();
                System.out.println("File downloaded successfully");

            } else {
                System.out.println("File not found on server");
            }

            socket.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
