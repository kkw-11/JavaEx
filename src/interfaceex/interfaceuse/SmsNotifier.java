package interfaceex.interfaceuse;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String target, String message) {
        System.out.printf("[SMS] to=%s, message=%s%n", target, message);
    }
}
