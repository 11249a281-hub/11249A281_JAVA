import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Receive data from client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = input.readLine();
            System.out.println("Client: " + message);

            // Send response to client
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello from Server");

            // Close connections
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}