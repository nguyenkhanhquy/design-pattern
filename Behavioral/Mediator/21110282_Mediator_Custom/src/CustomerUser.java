public class CustomerUser extends User {

    public CustomerUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("[" + name + "]" + " đã gửi tin nhắn: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String nameSender) {
        System.out.println("[" + name + "]" + " nhận được tin nhắn từ " + "[" + nameSender + "]" + ": " + message);
    }

}
