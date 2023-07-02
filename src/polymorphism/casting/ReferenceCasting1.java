package polymorphism.casting;

import polymorphism.FireEngine;
import polymorphism.Car;


public class ReferenceCasting1 {
    public static void main(String[] args) {
        //1.
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        //2.
        car = fe; // 업 캐스팅 형변환 생략 가능

        //3.
        fe2 = (FireEngine)car; // 다운 캐스팅 형변환 생략 불가

        //car.water(); //car 타입의 참조변수로는 자식 인스턴스 메서드 water()를 호출할 수 없다.
//        fe.water();
//        fe2.water();
    }
}
