package encode;

import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) {
        String str = "test";
        System.out.println(str.getBytes());
        String encodededStr = Base64.getEncoder().encodeToString(str.getBytes());

        System.out.println("encoded string: " + encodededStr);

        byte[] decodedBytes = Base64.getDecoder().decode(encodededStr);

        String decodedStr = new String(decodedBytes);

        System.out.println("decoded string: " + decodedStr);
    }
}
