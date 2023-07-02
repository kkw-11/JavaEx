package exception;

import java.io.IOException;

public class TException {
    public void read()  {
        try {
            throw new IOException();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Running read method...");
    }
}
