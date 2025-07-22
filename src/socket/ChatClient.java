package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             BufferedWriter networkOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.print("[클라이언트:] 서버로 보낼 메시지 입력: ");
                String msg = keyboardInput.readLine();

                networkOut.write(msg + "\n");
                networkOut.flush();
                System.out.println("서버로 메시지를 전송했습니다. ");
                if (msg == null || msg.equals("bye")) {
                    System.out.println("채팅 프로그램을 종료 합니다. ");
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
