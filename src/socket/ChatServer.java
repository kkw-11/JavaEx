package socket;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ChatServer {
    private static final int PORT = 12345;
    // 모든 클라이언트 소켓을 저장 (스레드 안전하게)
    private static final Set<BufferedWriter> clientWriters = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) {
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());
                // 클라이언트마다 새 스레드 실행
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 내부 클래스: 클라이언트 처리용 핸들러
    // ... (기존 import와 클래스 정의)
    static class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader in;
        private BufferedWriter out;
        private String nickname;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                clientWriters.add(out);

                // 연결되자마자 닉네임 먼저 받음
                this.nickname = in.readLine();
                broadcast("[알림] " + nickname + " 님이 입장했습니다!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    broadcast("[" + nickname + "] " + msg);
                }
            } catch (IOException e) {
                // 연결 끊김
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                clientWriters.remove(out);
                broadcast("[알림] " + nickname + " 님이 퇴장했습니다.");
            }
        }

        private void broadcast(String msg) {
            for (BufferedWriter writer : clientWriters) {
                try {
                    writer.write(msg + "\n");
                    writer.flush();
                } catch (IOException ignored) {}
            }
        }
    }
}
