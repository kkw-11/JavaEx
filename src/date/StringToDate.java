package date;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String testText = "hex Test Text";
        byte[] testToBytes = testText.getBytes("UTF-8");

        //Hex 인코딩(Byte To String)
        String encodeHexString = DatatypeConverter.printHexBinary(testToBytes);
        String hexString = "50654d71765452686366446c36356a78616f57554c652b706475636467326d5443336b434f7353665862553d";

        //Hex 디코딩(String to Byte)
        byte[] decodeHexByte = DatatypeConverter.parseHexBinary(hexString);

        System.out.println("인코딩 전: " + testText);
        System.out.println("인코딩: " + encodeHexString);
        System.out.println("디코딩: " + new String(decodeHexByte));

    }

    public static void add(int[] arr){
        for(int i = 0;i < arr.length;++i){
            System.out.println(arr[i]);
        }
    }

}


