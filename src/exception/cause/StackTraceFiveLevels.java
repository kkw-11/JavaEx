package exception.cause;

public class StackTraceFiveLevels {
    public static void main(String[] args) {
        try{
            method1();

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    static void method1() { method2();}

    static void method2() { method3();}

    static void method3() { method4();}

    static void method4() { method5();}

    static void method5() {throw new NullPointerException();}
}
