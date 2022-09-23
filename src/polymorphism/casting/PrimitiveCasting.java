package polymorphism.casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int intNum = 10;
        long longNum = 13L;
        longNum = intNum;

        intNum = (int)longNum;

        System.out.println("intNum = " + intNum);
        System.out.println("longNum = " + longNum);
    }
}
