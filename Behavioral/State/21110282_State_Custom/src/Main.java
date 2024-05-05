import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Mô phỏng việc thay đổi trạng thái của đèn giao thông
        trafficLight.requestChange(); // Đỏ -> Vàng
        trafficLight.requestChange(); // Vàng -> Xanh
        trafficLight.requestChange(); // Xanh -> Đỏ

        System.out.println("--------------------------------------------");

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                trafficLight.requestChange();
            }
        }, 0, 5000); // Delay 0 giây, và thực hiện sau mỗi 5 giây
    }

}
