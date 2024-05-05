public class MediatorDemo {

    public static void main(String[] args) {
        ProjectMediator projectMediator = new ProjectMediator();

        Tester tester = new Tester(projectMediator);
        Developer developer = new Developer(projectMediator);

        projectMediator.setTester(tester);
        projectMediator.setDeveloper(developer);

        tester.send("Hello from Tester!");
        developer.send("Hi from Developer!");
    }

}
