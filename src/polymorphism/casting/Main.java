package polymorphism.casting;

public class Main {
    public static void main(String[] args) {
        float f = 30.9f;
        int i  = (int)f;
        double d = 10.0;
        i = (int)d;
        long l = 10L;
        f = l;
        l = (long)f;
    }
}
