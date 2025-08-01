package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        System.out.println("=== 쓰레드풀 사용 ===");

        // 쓰레드풀 3개만 생성
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;

            executor.submit(() -> {
                System.out.println("Task " + taskId + " 시작 - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 작업 처리 시간 1초
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " 종료 - " + Thread.currentThread().getName());
                System.out.println();
            });
        }

        executor.shutdown(); // 더 이상 작업 받지 않고 대기 중인 작업 처리 후 종료
    }
}

