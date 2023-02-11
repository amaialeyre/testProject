package lesson12task3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;


public class SumClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Socket socket = new Socket("localhost", 9999);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(numbers);

        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        int sum = (int) objectInputStream.readObject();
        System.out.println("Sum: " + sum);
        socket.close();
    }
}
