public class YellowState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight light) {
        System.out.println("Đèn giao thông màu vàng. Chuẩn bị dừng lại!");
        light.setState(new RedState());
    }

}
