package interfaceex.interfaceuse;

public class Main {
    public static void main(String[] args){
        //SMS 버전
        Notifier sms = new SmsNotifier();
        MessageService smsService = new MessageService(sms);
        smsService.notifyUser("010-1234-5678", "인터페이스 사용 SMS");
    }
}
