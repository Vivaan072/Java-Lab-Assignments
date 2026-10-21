
import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");

        Socket socket = server.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true);

        String message;

        while ((message = in.readLine()) != null) {
            System.out.println("Client: " + message);

            if (message.equalsIgnoreCase("bye")) {
                out.println("Goodbye!");
                break;
            }

            out.println("Message received: " + message);
        }

        socket.close();
        server.close();
    }
}
