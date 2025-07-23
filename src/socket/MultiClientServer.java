package socket;

import java.io.*;
import java.net.*;

public class MultiClientServer {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        System.out.println("서버 시작. 클라이언트 연결 대기 중...");
        MultiClientServer server = new MultiClientServer();

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
            ) {
                String nickName = in.readLine();
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("[" + nickName + "] 메시지: " + message);
                    if ("bye".equalsIgnoreCase(message.trim())) {
                        System.out.println("[" + socket.getInetAddress() + "] 클라이언트가 bye로 종료 요청");
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("클라이언트와 통신 중 오류 발생: " + socket.getInetAddress());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("클라이언트 연결 종료: " + socket.getInetAddress());
            }
        }
    }
}
