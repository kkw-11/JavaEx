package socket;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1"; // 서버 IP(로컬)
        final int SERVER_PORT = 12345;        // 서버와 동일한 포트

        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT)) {
            System.out.println("서버에 연결 성공!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
