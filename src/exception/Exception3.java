package exception;

import java.io.IOException;

public class Exception3 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("예외 처리 완료");
    }
}
