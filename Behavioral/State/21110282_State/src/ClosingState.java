public class ClosingState implements DoorState {

    @Override
    public void click(Door door) {
        door.setState(new StoppedWhileClosingState());
        System.out.println("Click ClosingState. Transitioning to StoppedWhileClosingState.");
    }

    @Override
    public void complete(Door door) {
        door.setState(new ClosedState());
        System.out.println("ClosingState complete. Transitioning to ClosedState.");
    }

    @Override
    public void timeout(Door door) {
        System.out.println("Timedout. Remains in ClosingState.");
    }

}
