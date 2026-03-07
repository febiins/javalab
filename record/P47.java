package record;
import java.io.*;
import java.net.*;
import java.util.*;

public class P47 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter file URL: ");
            String fileURL = sc.nextLine();

            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();

            InputStream in = connection.getInputStream();

            String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);

            String saveDir = "D:\\clientdownload\\";

            FileOutputStream out = new FileOutputStream(saveDir + fileName);

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            out.close();
            in.close();
            sc.close();

            System.out.println("File downloaded successfully to:");
            System.out.println(saveDir + fileName);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
