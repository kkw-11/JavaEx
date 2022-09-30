package polymorphism.argument;

public class Car {
    int price;

    public Car(){
    }
    protected Car(int price){
        this.price = price;
    }

    void drive() {
        System.out.println("drive!!");
    }

    void stop(){
        System.out.println("stop!!!");
    }
}
