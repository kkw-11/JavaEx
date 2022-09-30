package polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Car car = new FireEngine();


        car.stop();
        car.drive();
//        car.water();

        SmartTv smartTv = new SmartTv();
        Tv tv = new SmartTv(); //조상 타입의 참조변수로 자손 인스턴스를 참조, 참조변수 타입과 인스턴스 타입과 일치하지 않지만 참조 가능

        //부모 클래스(Tv)에서 정의된 메서드
        smartTv.power();
        smartTv.channelUp();
        smartTv.channelDown();

        //자식 클래스(SmartTv)에서 정의된 메서드
        smartTv.watchYoutube();

        //부모타입 참조변수로는 자식 인스턴스를 가리키고 있더라도 자식인스턴스의 멤버를 참조할 수 없다.
        tv.power();
        tv.channelUp();
        tv.channelDown();

//        tv.watchYoutube();//에러 발생!, tv 변수가 부모타입(Tv) 참조변수이므로 실제 인스턴스가 자식 타입(SmartTv)이더라도 접근 불가능

//        SmartTv smartTv1 = new Tv(); //에러 발생!, 자손타입의 참조변수로 조상타입의 인스턴스를 암조하는 것은 불가능하다.

    }
}
