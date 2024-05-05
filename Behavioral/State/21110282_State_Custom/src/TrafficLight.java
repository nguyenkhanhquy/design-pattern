public class TrafficLight {

    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState(); // Ban đầu, đèn giao thông ở trạng thái đỏ
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void requestChange() {
        state.handleRequest(this);
    }

}
