package record;

import java.io.*;
import java.net.*;
import java.util.*;

class ClientHandler extends Thread {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private static List<PrintWriter> clientWriters = new ArrayList<>();

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(
                    socket.getOutputStream(), true);

            // Add client output stream to list
            synchronized (clientWriters) {
                clientWriters.add(out);
            }

            String message;

            while ((message = in.readLine()) != null) {

                // Broadcast to all clients
                synchronized (clientWriters) {
                    for (PrintWriter writer : clientWriters) {
                        writer.println(message);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}

public class PublicChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Public Chat Server Started...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler client = new ClientHandler(socket);
                client.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
