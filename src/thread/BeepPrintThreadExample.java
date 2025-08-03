package thread;

import java.awt.*;

public class BeepPrintThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 20; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        });

        thread.start();

        for(int i = 0; i < 20; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
