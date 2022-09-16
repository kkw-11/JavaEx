package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTotal {
    private int total = 0;
    public void printOddNumberAndTotalByFor(int start, int end){
        total = 0;
        System.out.println(start + "부터 " + end + "사이 " + "홀수 출력");
        for(int number = start; number <= end; ++number){
            if(number % 2 == 1) System.out.println(number);
            total += number;
        }
        System.out.println("--------------------");
        System.out.println(start + "부터 " + end + "까지 " + "총합:" + total);
    }

    public void printOddNumberAndTotalByForEach(int start, int end){
        total = 0;
        int[] oneToHundred = IntStream.range(start, end + 1).toArray();

        System.out.println(start + "부터 " + end + "사이 " + "홀수 출력");
        for (int number: oneToHundred) {
            if(number % 2 == 1) System.out.println(number);
            total += number;

        }
        System.out.println("--------------------");
        System.out.println(start + "부터 " + end + "까지 " + "총합:" + total);
    }

    public void printOddNumberAndTotalByStream(int start, int end){
        total = 0;
        int[] oneToHundred = IntStream.range(start, end + 1).toArray();

        Arrays.stream(oneToHundred).filter(i -> i % 2 == 1).forEach(System.out::println);

        total = Arrays.stream(oneToHundred).sum();

        System.out.println(start + "부터 " + end + "까지 " + "총합:" + total);
    }
}
