package thread;

public class ThreadExample {
    public static void main(String[] args) {

        System.out.println("1. 메인 스레드에서 실행");

        Thread thread = new Thread(() -> {
            System.out.println("2. 새로운 스레드에서 실행");
        });

        thread.start();

        System.out.println("3. 메인 스레드 종료");
    }
}

