package variable;

public class PrimitiveParamEx {

    public static void main(String[] args) {
        //1.
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        //2.
        change(d.x);
        //4.
        System.out.println("------------------");
        System.out.println("After change(d.x)");
        System.out.println("------------------");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){
        //3.

        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
