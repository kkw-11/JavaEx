package stream;

public class Main {
    public static void main(String[] args) {
        StreamTotal streamTotal = new StreamTotal();

        long startTime = System.currentTimeMillis();
        streamTotal.printOddNumberAndTotalByFor(1,100000);
        long endTime = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (endTime - startTime));


//        streamTotal.printOddNumberAndTotalByForEach(1, 100);


        startTime = System.currentTimeMillis();
        streamTotal.printOddNumberAndTotalByStream(1, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (endTime - startTime));
    }
}
