package serialize;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialEx2 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.txt";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            ObjectInputStream in = new ObjectInputStream(bis);

            UserInfo u1 = (UserInfo) in.readObject();

            System.out.println(u1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}