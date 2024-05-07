public class GreenState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLight light) {
        System.out.println("Đèn giao thông màu xanh. Tiếp tục di chuyển!");
        light.setState(new YellowState());
    }

}
