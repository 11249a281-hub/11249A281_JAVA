import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Send message to server
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello from Client");

            // Receive response from server
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = input.readLine();
            System.out.println("Server: " + message);

            // Close connection
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}