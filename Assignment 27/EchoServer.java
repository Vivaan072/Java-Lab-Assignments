
import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5001);
        System.out.println("Echo server is waiting...");

        Socket socket = server.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true);

        String message = in.readLine();

        System.out.println("Client message: " + message);
        out.println(message);

        socket.close();
        server.close();
    }
}
