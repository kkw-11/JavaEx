package interfaceex.nointerface;

public class EmailSender {
    public void send(String to, String message){
        System.out.printf("[EMAIL] to=%s, message=%s%n", to, message);
    }
}
