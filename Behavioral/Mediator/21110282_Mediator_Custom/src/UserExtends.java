public class UserExtends extends User {

    public UserExtends(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " đã gửi tin nhắn: " + message);
        System.out.println("----------------------------------------------------------");
        this.chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String nameSender) {
        System.out.println(this.name + " nhận được tin nhắn từ " + nameSender + ": " + message);
    }

}
