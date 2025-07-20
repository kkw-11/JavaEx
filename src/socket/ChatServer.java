package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        final int PORT = 12345; // 사용할 포트번호
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket clientSocket = serverSocket.accept(); // 클라이언트 연결 대기
            System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
