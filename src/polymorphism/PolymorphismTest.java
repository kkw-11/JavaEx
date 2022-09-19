package polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new FireEngine();
        Car c3 = new Ambulance();
        Car[] arr = {c1, c2, c3};

        arr[0].drive();
        arr[0].stop();
        arr[1].drive();
        arr[1].stop();
        arr[2].drive();
        arr[2].stop();


        SmartTv smartTv = new SmartTv();
        Tv tv = new SmartTv(); //조상 타입의 참조변수로 자손 인스턴스를 참조, 참조변수 타입과 인스턴스 타입과 일치하지 않지만 참조 가능

        //부모 클래스(Tv)에서 정의된 메서드
        smartTv.power();
        smartTv.channelUp();
        smartTv.channelDown();

        //자식 클래스(SmartTv)에서 정의된 메서드
        smartTv.watchYoutube();

        tv.power();
        tv.channelUp();
        tv.channelDown();


//        tv.watchYoutube();//에러 발생!, tv 변수가 부모타입(Tv) 참조변수이므로 실제 인스턴스가 자식 타입(SmartTv)이더라도 접근 불가능

//        SmartTv smartTv1 = new Tv(); //에러 발생!, 자손타입의 참조변수로 조상타입의 인스턴스를 암조하는 것은 불가능하다.

    }
}
