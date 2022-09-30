package polymorphism.argument;

public class Buyer {
    int money = 1000;
    Car[] parkinglot = new Car[10];
    int index = 0;

    void buy(Car car){
        if(money < car.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= car.price;
        parkinglot[index++] = car;

        /**
         * car 참조변수 출력시 자식 클래스에서 오버로딩된 toString 메서드 실행
         * 참조변수의 타입과 관계없이 메서드는 항상 실제 인스턴스의 메서드가 실행
         */

        System.out.println(car + "을(를) 구입하였습니다.");
    }

    void smartScanner(){
        int totalPrice = 0;
        String itemList = "";

        for(int index = 0; index < parkinglot.length-1; ++index){
            if(parkinglot[index] == null) break;
            totalPrice += parkinglot[index].price;
            itemList += parkinglot[index] + "  ";
        }

        System.out.println("구입하신 상품의 총금액은 " + totalPrice + "만원입니다.");
        System.out.println("구입하신 상품은 " + itemList + "입니다.");
    }
}