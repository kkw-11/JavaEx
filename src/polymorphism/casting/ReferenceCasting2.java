package polymorphism.casting;

import polymorphism.FireEngine;
import polymorphism.Car;

public class ReferenceCasting2 {
    public static void main(String[] args) {
        Car car = new Car();

        FireEngine fe = (FireEngine) car;
    }
}
