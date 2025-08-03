package thread;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 20; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        for(int i = 0; i < 20; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
