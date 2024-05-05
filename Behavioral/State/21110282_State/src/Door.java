public class Door {

    private DoorState state; // Trạng thái hiện tại của cửa

    public Door() {
        // Khởi tạo cửa ở trạng thái mặc định (ClosedState)
        this.state = new ClosedState();
    }

    public void click() {
        state.click(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void timeout() {
        state.timeout(this);
    }

    public void setState(DoorState newState) {
        this.state = newState;
    }

}
