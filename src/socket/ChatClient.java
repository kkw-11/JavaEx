package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try (
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bufferedOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("서버와 연결 : " + SERVER_IP);
            while (true) {
                // 1. 클라이언트 → 서버로 메시지 전송
                System.out.print("[클라이언트] 메시지 입력: ");
                String clientMsg = scanner.nextLine();
                bufferedOut.write(clientMsg + "\n");
                bufferedOut.flush();
                System.out.println("[클라이언트 메시지 전송이 완료되었습니다.\n");

                if (clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("채팅 종료");
                    break;
                }

                // 2. 서버 메시지 수신
                String serverMsg = bufferedIn.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("서버에서 채팅 종료");
                    break;
                }
                System.out.println("[서버] " + serverMsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
