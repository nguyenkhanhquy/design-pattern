public class Main {

    public static void main(String[] args) {
        // Tạo một đối tượng OnlineEventNotifier (Chủ đề)
        OnlineEventNotifier notifier = new OnlineEventNotifier();

        // Đăng ký các người quan sát (Users)
        Observer user1 = new User("User 1");
        Observer user2 = new User("User 2");

        notifier.registerObserver(user1);
        notifier.registerObserver(user2);

        // Phát sóng một sự kiện trực tuyến mới
        notifier.publishEvent("Live concert streaming");

        // Hủy đăng ký một số người quan sát
        notifier.unregisterObserver(user2);

        // Phát sóng một sự kiện trực tuyến khác
        notifier.publishEvent("Webinar on AI");
    }

}
