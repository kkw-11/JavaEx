package thread.threadpool;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("=== 직접 Thread 생성 ===");

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;

            Thread thread = new Thread(() -> {
                System.out.println("Task " + taskId + " 시작 - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 작업 처리 시간 1초
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " 종료 - " + Thread.currentThread().getName());
            });

            thread.start();
        }
    }
}
