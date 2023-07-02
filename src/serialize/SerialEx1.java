package serialize;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.txt";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("JavaMan", "1234", 30);

            out.writeObject(u1);
            out.close();
            System.out.println("직렬화가 잘 끝났습니다.");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}