package polymorphism.argument;

public class Metaverse {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Maserati maserati = new Maserati();
        Porsche porsche = new Porsche();

        Buyer buyer = new Buyer();

        buyer.buy(ferrari);
        buyer.buy(maserati);
        buyer.buy(porsche);

        System.out.println("현재 남은 돈은 " + buyer.money + "만원입니다.");

        buyer.smartScanner();
    }
}
