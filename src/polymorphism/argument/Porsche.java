package polymorphism.argument;

import polymorphism.argument.Car;

public class Porsche extends Car {

    Porsche(){
        super(300);
    }

    @Override
    public String toString() {
        return "Porsche";
    }
}
