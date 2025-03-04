import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_IP = "127.0.0.1";  // Change this if needed
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to chat server!");
            
            // Thread to read messages from the server
            Thread readerThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("\n" + serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            readerThread.start();

            // Sending messages to the server
            while (true) {
                System.out.print("You: ");
                String message = scanner.nextLine();
                out.println(message);
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Disconnected from chat.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
