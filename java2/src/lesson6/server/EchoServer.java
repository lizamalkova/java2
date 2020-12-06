package lesson6.server;

import org.w3c.dom.ls.LSOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static final int SERVER_PORT = 8189;

    public static void main(String[] args) {

        new EchoServer().start();
    }

    private  void start() {
        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Ожидаем подключение...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Соединение установлено!");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            Thread inputThread = null;

            inputThread = runInputThread(in);
            runOutputLoop(out);

            System.out.println("Сервер остановлен.");

        }
        catch (IOException e) {
            System.out.println("Порт уже занят");
            e.printStackTrace();
        }
    }

    private Thread runInputThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = in.readUTF();
                    System.out.println("Cообщение пользователя: " + message);
                    if (message.equals("/exit")) {
                        break;
                    }
                } catch (IOException e) {
                    System.out.println("Connection was closed");
                    break;
                }
            }
        });
        thread.start();
        return thread;
    }

    private void runOutputLoop(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.next();
            out.writeUTF(message);
            if (message.equals("/end")) {
                break;
            }
        }
    }
}
