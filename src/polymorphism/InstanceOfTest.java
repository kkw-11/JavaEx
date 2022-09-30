package polymorphism;

public class InstanceOfTest {
    public static void main(String[] args) {
        Car car = new Car();

        FireEngine fe = null;

//        fe = (FireEngine)car; //실행시 에러 발생
        
        //스터디 질문 테스트
        Car car2 = new Car();
        car2 = (FireEngine)car; //'=' 연산자 실행 전 타입캐스팅 오류 발생
//        car2.water();
        if(car instanceof FireEngine){
            System.out.println("car는 FireEngine으로 타입캐스팅이 가능하다.");
            fe = (FireEngine)car; //실행시 에러 발생
        }
        else {
            System.out.println("car 참조변수는 현재 Car 인스턴스를 가리키고 있으므로 FireEngine으로 타입캐스팅이 불가능하다.");
        }


        FireEngine fe2 = new FireEngine();

        System.out.println(fe2.getClass().getName());
        if(fe2 instanceof FireEngine){
            System.out.println("fe2는 FireEngine으로 타입캐스팅이 가능하다.");
            fe = fe2;
        }

        if(fe2 instanceof Car){
            System.out.println("f2e는 Car로 타입캐스팅이 가능하다.");
            car = fe2;
        }

        if(fe2 instanceof Object){
            System.out.println("fe2는 Object로 타입캐스팅이 가능하다.");
            Object ob = fe2;
        }

    }
}