package constructor;

public class Car {
    String color;
    String brand;

//    기본 생성자


    Car(){
        this("black","Hyundai");
        System.out.println("생성자 출력");
    }

    Car(String color, String brand){
        this.color = color; //this 키워드를 사용하지 않으면 매개변수와 인스턴스 변수가 구별할 수 없다.
        this.brand = brand;
    }
}
