package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try (
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                // 1. 클라이언트 → 서버로 메시지 전송
                System.out.print("[클라이언트] 메시지 입력: ");
                String clientMsg = scanner.nextLine();
                out.write(clientMsg + "\n");
                out.flush();

                if (clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("채팅 종료");
                    break;
                }

                // 2. 서버 메시지 수신
                String serverMsg = in.readLine();
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
