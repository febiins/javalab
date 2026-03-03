/*
Program to implement server client communication.

@Febin Sunny
Roll No:27
  
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servers {
    public static void main(String[] args) {

        try {
            
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is waiting for client...");

            
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            
            String message = in.readLine();
            System.out.println("Client says: " + message);

            
            out.println("Hello Client, Message received!");

            
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
