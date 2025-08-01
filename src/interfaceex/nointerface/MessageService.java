package interfaceex.nointerface;

public class MessageService {
    private EmailSender emailSender = new EmailSender(); //바뀐 구현체

    public void notifyUser(String user, String message){
        emailSender.send(user + "@example.com", message); //서비스 코드 직접 변경
    }
}
