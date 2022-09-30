package jinmyeong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIstTEst {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("서울");
        list.add("북경");
        list.add("도쿄");
        list.add("상해");
        list.add("뉴욕");
        list.add("서울");

        System.out.println("list = " + list);

        list.add(1,"LA"); // 뒤로 한칸씩 밀린다.
        System.out.println("list = " + list);

        list.remove("LA"); // 한칸씩 앞으로 당긴다.
        System.out.println("list = " + list);

        Object obj[] = list.toArray(); //list의 데이터를 가진 Object타입의 배열을 생성하여 변환. --> 일반 배열로 변환.
        System.out.println("obj = " + Arrays.toString(obj));

        String cities[] = new String[0];
        cities = list.toArray(cities); // toArray()에 변환하고싶은 타입을 넣으면 된다. --> cities가 String 타입이므로 String타입의 배열 생성.
        System.out.println("cities = " + Arrays.toString(cities));

        list.clear(); // 모든데이터 삭제
        System.out.println("list.isEmpty() = " + list.isEmpty());

        List<String> list2 = Arrays.asList("서울", "뉴욕", "상해"); // asList() 동적인 인자값을 받아서 넣을 수 있다.
        System.out.println("list2 = " + list2);

        list.addAll(list2); // addAll() 인자값으로 컬랙션을 전달하면 현재 컬렉션과 하나로 통일시켜준다.
        System.out.println("list = " + list);

        list.add("부산");
        System.out.println("list = " + list);

        list.retainAll(list2); // 인자로 전달한 내용만 남겨두고 모두 삭제
        System.out.println("list = " + list);
    }
}
