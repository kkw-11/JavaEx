package typecasting;

public class Main {
    public static void main(String[] args) {
        long num1 = 13; //작은 자료형 int에서 큰 자료형 long으로 형변환 생략 가능
        
        int num2 = (int)13L; //큰 자료형 long에서 작은 자료형 int로 형변환 생략 불가능
    }
}
