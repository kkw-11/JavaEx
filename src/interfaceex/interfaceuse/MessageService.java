package interfaceex.interfaceuse;

public class MessageService {
    private EmailSender emailSender = new EmailSender(); //강한 결합

    public void notifyUser(String user, String message){
        //EmailSender 내부 구현은 몰라도 되지만, 클래스가 직접의존
        emailSender.send(user + "@email.com", message);
    }

    public static void main(String[] args){
        MessageService messageService = new MessageService();
        messageService.notifyUser("alice", "인터페이스 없이 직접 구현체 사용");
    }

}
