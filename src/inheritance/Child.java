package inheritance;

public class Child extends Parent{
    public void play() {
        System.out.println("놀자!");
    }

    @Override
    protected void myWork(String name) {
        System.out.println(name + "은 학교에 간다.");
        System.out.println(name + "은 학원에 간다.");
    }
}
