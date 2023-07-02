package exception;

public class Main {

    public static void customThrowExample() throws Exception {
        // 다시 예외처리해줘야한다.
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            customThrowExample();
        } catch (Exception e){
            System.out.println("catch구문은 잡히지않는다. try에서 customThrowExample으로 직접 예외를 발생시킴");
        }
    }
}