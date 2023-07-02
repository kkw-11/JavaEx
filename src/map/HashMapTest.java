package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Car, String> hm = new HashMap<>();

        Car car = new Car();

        FireEngine fe = new FireEngine();

        hm.put(new Car(100), "I'm Car Class");

        hm.put(new Car(100), "I'm Car Class");
        hm.put(new FireEngine(), "I'm Car Class");

        System.out.println("size :: " + hm.size());

    }
}
