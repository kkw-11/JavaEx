package interfaceex.nointerface;

public class SmsSender {
    public void sendSms(String phone, String message){
        System.out.printf("[SMS] to=%s, message=$s$n",phone, message);
    }
}
