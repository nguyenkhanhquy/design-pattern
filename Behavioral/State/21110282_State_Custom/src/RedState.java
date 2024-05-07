public class RedState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight light) {
        System.out.println("Đèn giao thông màu đỏ. Dừng lại!");
        light.setState(new GreenState());
    }

}
