public class OpeningState implements DoorState {

    @Override
    public void click(Door door) {
        door.setState(new StoppedWhileOpeningState());
        System.out.println("Click OpeningState. Transitioning to StoppedWhileOpeningState.");
    }

    @Override
    public void complete(Door door) {
        door.setState(new OpenState());
        System.out.println("OpeningState complete. Transitioning to OpenState.");
    }

    @Override
    public void timeout(Door door) {
        System.out.println("Timedout. Remains in OpeningState.");
    }

}
