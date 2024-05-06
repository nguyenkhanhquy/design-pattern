public class User implements Observer {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    // Phương thức để cập nhật thông tin khi có sự kiện trực tuyến mới
    @Override
    public void update(OnlineEvent event) {
        System.out.println(name + " received online event: " + event.getEventName());
    }

}
