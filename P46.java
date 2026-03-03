import java.util.*;
import java.net.*;

public class P46 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a URL: ");
            String urlString = sc.nextLine();

            URL url = new URL(urlString);

            System.out.println("\n--- URL Details ---");
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host     : " + url.getHost());
            System.out.println("Port     : " + url.getPort());
            System.out.println("Path     : " + url.getPath());
            System.out.println("File     : " + url.getFile());

            sc.close();

        } catch (Exception e) {
            System.out.println("Invalid URL");
        }
    }
}
