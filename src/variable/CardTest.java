package variable;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width); //클래스 변수(static 변수)는 객체 생성없이 클래스명.클래스변수로 사용 가능
        System.out.println("Card.height = " + Card.height);
        System.out.println("--------------------------------");
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 카드의 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 카드의 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("--------------------------------");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        System.out.println("--------------------------------");
        c1.width = 50; //클래스 변수를 인스턴스 참조변수로 접근하여 변경가능 하지만, 공유되는 값이기 때문에 모든 인스턴스에도 영향을 미친다.
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 카드의 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 카드의 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("--------------------------------");
    }
}
