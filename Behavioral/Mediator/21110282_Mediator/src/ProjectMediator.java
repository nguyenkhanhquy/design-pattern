public class ProjectMediator implements Mediator {

    private Tester tester;
    private Developer developer;

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == tester) {
            developer.receive(message);
        } else if (colleague == developer) {
            tester.receive(message);
        }
    }

}
