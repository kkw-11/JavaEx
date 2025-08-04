package thread;

public class MultiThreadSleepTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("메인 스레드: 시작!");
        Thread.sleep(5000); //  (메인 스레드에서 호출됨)
        //  백그라운드 스레드 생성
        Thread background = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("백그라운드 스레드 실행 중...");
                try {
                    Thread.sleep(1000); //  (백그라운드 스레드에서 호출됨)
                } catch (InterruptedException ignored) {}
            }
        });

        background.start(); //  백그라운드 스레드 실행 시작

        //  메인 스레드 출력
        System.out.println("메인 스레드: 잠시 멈춥니다...");

        Thread.sleep(5000); // (메인 스레드에서 호출됨)

        System.out.println("메인 스레드: 다시 시작!");
    }

}
