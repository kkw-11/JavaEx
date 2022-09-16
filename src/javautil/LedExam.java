package javautil;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeChannel(1);
        tv.changeVolume(11);
        tv.turnOff();

        System.out.println(TV.MAX_VOLUME);

    }
}