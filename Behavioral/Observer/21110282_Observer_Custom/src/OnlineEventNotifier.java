import java.util.ArrayList;
import java.util.List;

public class OnlineEventNotifier {

    private final List<Observer> observers = new ArrayList<>();

    // Phương thức để đăng ký người quan sát mới
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Phương thức để hủy đăng ký người quan sát
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    // Phương thức để thông báo cho tất cả người quan sát về sự kiện trực tuyến mới
    public void notifyObservers(OnlineEvent event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    // Phương thức để gửi sự kiện trực tuyến mới cho người dùng
    public void publishEvent(String eventName) {
        OnlineEvent event = new OnlineEvent(eventName);
        notifyObservers(event);
    }

}
