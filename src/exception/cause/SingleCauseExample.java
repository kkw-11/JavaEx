package exception.cause;

public class SingleCauseExample {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    static void methodA() {
        throw new NullPointerException("NPE 발생!");
    }
}

