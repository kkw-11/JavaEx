package method;

public class MyMath {
    long a;
    long b;

    long add(){return a + b;}
    long subtract(){return a - b;}
    long multiply(){return a * b;}
    double divide() {
        if(b != 0) return a / b;
        else return 0;
    }
}
