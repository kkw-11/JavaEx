package lambda;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("runnable 실행");

        runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 실행");
        });


    }
}
