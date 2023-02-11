package lesson12task3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class SumServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                List<Integer> numbers = (List<Integer>) objectInputStream.readObject();

                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(sum);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                if (socket != null) {
                    socket.close();
                }
            }
        }
    }
}
