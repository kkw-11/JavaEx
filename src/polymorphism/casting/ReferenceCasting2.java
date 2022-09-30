package polymorphism.casting;

import polymorphism.FireEngine;
import polymorphism.Car;

public class ReferenceCasting2 {
    public static void main(String[] args) {
        Car car = new Car();

        FireEngine fe = null;
        fe = (FireEngine) car; // 다운캐스팅으로 강제형변환을 하였지만 다형성이 적용되지 않는 조건이므로 에러가 발생한다.
    }
}
