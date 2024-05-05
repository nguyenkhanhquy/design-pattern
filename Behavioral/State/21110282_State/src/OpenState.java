public class OpenState implements DoorState {

    @Override
    public void click(Door door) {
        door.setState(new ClosingState());
        System.out.println("Click OpenState. Transitioning to ClosingState.");
    }

    @Override
    public void complete(Door door) {

    }

    @Override
    public void timeout(Door door) {

    }

}
