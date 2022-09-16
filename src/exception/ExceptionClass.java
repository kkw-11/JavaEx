package exception;

public class ExceptionClass {
    public static void main(String[] args){

        try{
            ExceptionClass.sumTwoNumbers("ㄱ", "2");
        }catch(NumberFormatException e){
            System.out.println("입력하신 값은 숫자가 아닙니다.");
        }
    }
    private static void sumTwoNumbers(String a, String b) throws NumberFormatException {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("문자로 입력받은 " + a + "," + b + "의 합은 " + sum + "입니다.");
    }
}




