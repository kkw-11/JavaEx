package interfaceex.interfaceuse;

public class MessageService {
    private final Notifier notifier; //인터페이스에만 의존

    //Constructor Injection
    public MessageService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String user, String message){
        //notifier 구현체의 send() 호출
        notifier.send(user, message);
    }
}
