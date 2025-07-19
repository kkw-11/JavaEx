package serialize.serialex;


import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        // 1. 객체를 파일에 직렬화
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("직렬화 성공: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. 파일에서 객체 역직렬화
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("역직렬화 성공: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
