package polymorphism.argument;

import polymorphism.argument.Car;

public class Maserati extends Car {
    Maserati(){
        super(200);
    }

    @Override
    public String toString() {
        return "Maserati";
    }

}
