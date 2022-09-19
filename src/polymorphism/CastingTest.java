package polymorphism;

public class CastingTest {
    public static void main(String[] args) {
        long num1 = 13; //작은 자료형 int에서 큰 자료형 long으로 형변환 생략 가능

        int num2 = (int)13L; //큰 자료형 long에서 작은 자료형 int로 형변환 생략 불가능


        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환이 생략된 형태다. 자식타입 -> 부모타입
//        car.water();

        fe2 = (FireEngine)car; // 다운 캐스팅 형변환 생략 불가, 부모타입 -> 자손타입
        fe2.water();

        /**
         * 아래 한줄은 밑에 두줄과 같은 뜻이다.
         */
        Tv tv = (Tv)new SmartTv();

        SmartTv st = new SmartTv();
        Tv t = (Tv)st;
        st = (SmartTv)tv;
        st.channelUp();





    }
}
