package interfaceex.nointerface;

public class MessageService {
    private SmsSender smsSender = new SmsSender(); //바뀐 구현체

    public void notifyUser(String user, String message){
        smsSender.sendSms(user, message); //서비스 코드 직접 변경
    }

    public static void main(String[] args){
        MessageService messageService = new MessageService();
        messageService.notifyUser("alice", "인터페이스 없이 직접 구현체 사용");
    }
}
