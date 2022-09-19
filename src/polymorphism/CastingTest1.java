package polymorphism;

public class CastingTest1 {
    public static void main(String[] args) {

        Car car = null;

        FireEngine fe = new FireEngine();;
        FireEngine fe2 = null;
        car = fe; // 업 캐스팅 형변환 생략 가능
//        car.water(); //car 타입의 참조변수로는 water()를 호출할 수 없다.

        fe2 = (FireEngine)car; // 다운 캐스팅 형변환 생략 불가
        fe.water();

    }
}
