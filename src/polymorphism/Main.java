package polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car();

        SmartTv smartTv = new SmartTv();
        Tv tv = new SmartTv(); //부모 타입의 참조변수로 자식 인스턴스를 참조, 참조변수 타입과 인스턴스 타입과 일치하지 않지만 참조 가능

        //부모 클래스(Tv)에서 정의된 메서드
        smartTv.power();
        smartTv.channelUp();
        smartTv.channelDown();

        //자식 클래스(SmartTv)에서 정의된 메서드
        smartTv.watchYoutube();

        tv.power();
        tv.channelUp();
        tv.channelDown();


//        tv.watchYoutube(); //에러 발생!, tv 변수가 부모타입(Tv) 참조변수이므로 실제 인스턴스가 자식 타입(SmartTv)이더라도 접근 불가능

        SmartTv smartTv1 = (SmartTv) new Tv(); //에러 발생!, 자식타입의 참조변수로 부모타입의 인스턴스를 참조하는 것은 불가능하다. 강제 타입 캐스팅을 해도 에러가 발생한다.

    }
}