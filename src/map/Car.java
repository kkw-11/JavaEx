package map;

import java.util.Objects;

public class Car {
    int color;

    Car(){
    }

    Car(int color){
        this.color = color;
    }

    void drive(){
        System.out.println("drive!!");
    }

    void stop(){
        System.out.println("stop!!");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return color == car.color;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color);
//    }
}
