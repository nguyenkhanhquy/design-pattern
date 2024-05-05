public class ClosedState implements DoorState {

    @Override
    public void click(Door door) {
        door.setState(new OpeningState());
        System.out.println("Click ClosedState. Transitioning to OpeningState.");
    }

    @Override
    public void complete(Door door) {

    }

    @Override
    public void timeout(Door door) {

    }

}
