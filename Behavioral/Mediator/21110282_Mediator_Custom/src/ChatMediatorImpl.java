import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private final List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Người gửi sẽ không nhận tin nhắn của mình gửi
            if (u != user) {
                u.receive(message, user.name);
            }
        }
    }

}
