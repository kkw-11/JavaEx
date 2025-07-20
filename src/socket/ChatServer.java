package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        final int PORT = 12345;
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());

            // 클라이언트로부터 메시지 읽기
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            System.out.println("클라이언트로부터 메시지: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
