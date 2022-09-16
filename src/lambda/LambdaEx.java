package lambda;


@FunctionalInterface
interface MyFunction{
    int calc(int x, int y);
}

public class LambdaEx {
    public LambdaEx(){
        MyFunction f1 = (x, y) -> {return x+y;};
        System.out.println("f1의 결과 : "+ f1.calc(22, 100));

        MyFunction f2 = (x, y) -> {return x-y;};
        System.out.println("f2의 결과 : "+ f2.calc(99, 9));

    }

    public static void main(String[] args) {
        new LambdaEx();
    }
}
