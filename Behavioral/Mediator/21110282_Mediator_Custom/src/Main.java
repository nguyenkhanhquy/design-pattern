public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserExtends(mediator, "User 1");
        User user2 = new UserExtends(mediator, "User 2");
        User user3 = new UserExtends(mediator, "User 3");
        User user4 = new UserExtends(mediator, "User 4");
        User user5 = new UserExtends(mediator, "User 5");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Xin chào mọi người!!!");
    }

}
