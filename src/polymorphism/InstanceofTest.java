package polymorphism;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        System.out.println(fe.getClass().getName());
        if(fe instanceof FireEngine){
            System.out.println("fe는 FireEngine으로 타입캐스팅이 가능하다.");
        }

        if(fe instanceof Car){
            System.out.println("fe는 Car로 타입캐스팅이 가능하다.");
        }

        if(fe instanceof Object){
            System.out.println("fe는 Object로 타입캐스팅이 가능하다.");
        }

        Car car = new Car();

        FireEngine fe2 = null;

        car.drive();
        if(car instanceof FireEngine){
            System.out.println("car는 FireEngine으로 타입캐스팅이 가능하다.");
            fe2 = (FireEngine)car; //실행시 에러 발생
        }
        else {
            System.out.println("car는 FireEngine으로 타입캐스팅이 불가능하다.");
        }

    }
}
