package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        final int PORT = 12345;
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");

        try (
                ServerSocket serverSocket = new ServerSocket(PORT);
                Socket clientSocket = serverSocket.accept();
                BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter bufferedOut = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("클라이언트1 연결됨: " + clientSocket.getInetAddress());

            while (true) {
                // 1. 클라이언트 메시지 읽기
                String clientMsg = bufferedIn.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("클라이언트 연결 종료");
                    break;
                }
                System.out.println("[클라이언트1] : " + clientMsg);

                // 2. 서버 메시지 입력 및 전송
                System.out.print("[서버] 메시지 입력: ");
                String serverMsg = scanner.nextLine();
                bufferedOut.write(serverMsg + "\n");
                bufferedOut.flush();
                System.out.println("[서버의 메시지 전송이 완료되었습니다.]\n");

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
