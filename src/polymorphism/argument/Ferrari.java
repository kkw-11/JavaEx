package polymorphism.argument;

import polymorphism.argument.Car;

public class Ferrari extends Car {
    Ferrari(){
        super(100);
    }

    @Override
    public String toString() {
        return "Ferrari";
    }
}
