package polymorphism.argument;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Car[] item = new Car[10];
    int i = 0;

    void buy(Car c){
        if(money < c.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= c.price;
        bonusPoint += c.bonusPoint;
        item[i++] = c;
        System.out.println(c + "을(를) 구입하였습니다.");
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i < item.length-1; ++i){
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + "  ";
        }

        System.out.println("구입하신 상품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 상품은 " + itemList + "입니다.");
    }
}