//cserver
import java.io.*;
import java.net.*;


class ClientReceive extends Thread {
    private Socket socket;

    public ClientReceive(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("Server: " + msg);
            }
        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }
}


public class P41 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server!");

            // Start receiving thread
            ClientReceive receive = new ClientReceive(socket);
            receive.start();

            // Sending messages
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
