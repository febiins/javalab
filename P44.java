//publicchatserver

import java.io.*;
import java.net.*;

class ReceiveMessage extends Thread {

    private Socket socket;

    public ReceiveMessage(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message;

            while ((message = in.readLine()) != null) {
                System.out.println(message);
            }

        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }
}


public class P44 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to Public Chat Server");

            // Start receiving thread
            ReceiveMessage receive = new ReceiveMessage(socket);
            receive.start();

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(
                    new InputStreamReader(System.in));

            String message;

            while ((message = console.readLine()) != null) {
                out.println(message);
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
