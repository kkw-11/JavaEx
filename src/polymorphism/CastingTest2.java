package polymorphism;

public class CastingTest2 {
    public static void main(String[] args) {

        /**
         * FireEngine, Ambulance는 각각 Car Class를 상속 받았지만 서로는 아무런 관계가 아니다.
         * Java에서 참조변수의 형변환은 상속관계에서만 가능하기 때문에 FireEngine, Ambulance는 형변환할 수 없다.
         */
        FireEngine f;
        Ambulance a;
//        a = (Ambulance)f; // 에러, 상속관계가 아닌 클래스간의 형변환 불가
//        f = (FireEngine)a; // 에러 상속관계가 아닌 클래스간의 형변환 불가

    }
}
