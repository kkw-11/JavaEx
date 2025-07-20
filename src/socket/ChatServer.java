package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        final int PORT = 12345;
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");

        try (
                ServerSocket serverSocket = new ServerSocket(PORT);
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());

            // 서버 → 클라이언트, 클라이언트 → 서버 반복 송수신
            while (true) {
                // 1. 클라이언트 메시지 읽기
                String clientMsg = in.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("클라이언트 연결 종료");
                    break;
                }
                System.out.println("[클라이언트] " + clientMsg);

                // 2. 서버 메시지 입력 및 전송
                System.out.print("[서버] 메시지 입력: ");
                String serverMsg = scanner.nextLine();
                out.write(serverMsg + "\n");
                out.flush();

                // "bye" 입력 시 서버도 종료
                if (serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("서버 종료");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
