package polymorphism.casting;

import polymorphism.FireEngine;
import polymorphism.Car;

public class Main {
    public static void main(String[] args) {



//        Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//
//        car = fe;
//        fe2 = (FireEngine) car;
//
//        fe.water();


        Car car = new Car();



        float f = 30.9f;
        int i  = (int)f;
        double d = 10.0;
        i = (int)d;
        long l = 10L;
        f = l;
        l = (long)f;
    }
}
