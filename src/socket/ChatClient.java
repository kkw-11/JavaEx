package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;
        Scanner scanner = new Scanner(System.in);

        try (
                Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ) {
            System.out.println("**채팅방에 입장했습니다.**\n**닉네임을 입력하세요**");
            System.out.print("[닉네임 입력] : ");
            String nickName = scanner.nextLine();
            out.write(nickName + "\n");
            out.flush();
            while (true) {
                System.out.print("[" + nickName + "]" + "메시지 입력(bye 입력 시 종료):");
                String msg = scanner.nextLine();
                out.write(msg + "\n");
                out.flush();
                if ("bye".equalsIgnoreCase(msg.trim())) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

