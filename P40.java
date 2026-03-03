//Servers.java
/*
Write a program to implement a Generic class.
@Febin Sunny
Roll No:27
  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        try {
            // Connect to server (localhost, port 5000)
            Socket socket = new Socket("localhost", 1234);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            // Send message to server
            System.out.print("Enter message for server: ");
            String msg = sc.nextLine();
            out.println(msg);

            // Receive response
            String response = in.readLine();
            System.out.println("Server says: " + response);

            socket.close();
            sc.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
