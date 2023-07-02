package array;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        String str = "20221007";

        System.out.println("날짜 ===> {}" + format.parse(str));

        ArrayList a = new ArrayList<>();
        a.add(1);
        a.add("김기원");

        for (int i = 0; i < a.size(); ++i) {
            System.out.println(a.get(i));
        }
    }
}
