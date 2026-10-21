
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        String message;

        System.out.println("Connected to server.");

        do {
            System.out.print("Enter message: ");
            message = sc.nextLine();

            out.println(message);
            System.out.println("Server: " + in.readLine());

        } while (!message.equalsIgnoreCase("bye"));

        socket.close();
        sc.close();
    }
}
