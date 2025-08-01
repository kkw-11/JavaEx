package lambda;

public class Main {
    @FunctionalInterface
    interface Calculator {
        int operate(int a, int b);
    }

    public static void main(String[] args){
        Calculator add = (a , b) -> a + b;
        Calculator multiply = (a, b) -> a* b;

        System.out.println(add.operate(1, 2));
        System.out.println(multiply.operate(2, 3));
    }
}
