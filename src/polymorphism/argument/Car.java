package polymorphism.argument;

public class Car {
    int price;
    int bonusPoint;

    Car(){
    }
    Car(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    void drive() {
        System.out.println("drive!!");
    }

    void stop(){
        System.out.println("stop!!!");
    }
}
