package Method;

public class Main {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.a = 10;
        mm.b = 20;

        System.out.println(mm.add());

        System.out.println(StaticMyMath.add(10,20));
    }
}
