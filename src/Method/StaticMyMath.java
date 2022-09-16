package Method;

public class StaticMyMath {
    static final double ZERO = 0;
    static long add(long a, long b){return a + b;}
    static long add(long a, long b, long c){return a + b + c;}
    static String add(String a, String b){return a + b;}
    static long subtract(long a, long b){return a - b;}
    static long multiply(long a, long b){return a * b;}
    static double divide(long a, long b) {
        if(b != 0) return a / b;
        else return ZERO;
    }

}
