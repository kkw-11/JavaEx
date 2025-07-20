package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;
        Scanner scanner = new Scanner(System.in);

        System.out.print("[닉네임 입력] : ");
        String nickname = scanner.nextLine();

        try (
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ) {
            // 서버에 닉네임 먼저 전송
            out.write(nickname + "\n");
            out.flush();

            // 입력(내 메시지 송신) 스레드
            Thread sender = new Thread(() -> {
                try {
                    while (true) {
                        System.out.print("[내 메시지 입력] : ");
                        String msg = scanner.nextLine();
                        out.write(msg + "\n");
                        out.flush();
                    }
                } catch (IOException e) {
                    System.out.println("서버와 연결이 끊어졌습니다.");
                }
            });

            // 수신(서버 메시지) 스레드
            Thread receiver = new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("\r" + msg);
                        System.out.print("[내 메시지 입력] : "); // 입력 프롬프트를 재출력
                    }
                } catch (IOException e) {
                    System.out.println("\r서버와 연결이 끊어졌습니다.");
                }
            });

            sender.start();
            receiver.start();

            sender.join();
            receiver.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
