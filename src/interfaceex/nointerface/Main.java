package interfaceex.nointerface;

public class Main {
    public static void main(String[] args){
        MessageService messageService = new MessageService();
        messageService.notifyUser("alice", "메세지 전송이 완료되었습니다.");
    }
}
