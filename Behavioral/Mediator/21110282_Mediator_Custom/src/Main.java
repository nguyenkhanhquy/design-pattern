public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User adminUser = new AdminUser(mediator, "Admin");

        User employeeUser1 = new EmployeeUser(mediator, "Employee 1");
        User employeeUser2 = new EmployeeUser(mediator, "Employee 2");

        User customerUser1 = new CustomerUser(mediator, "Customer 1");
        User customerUser2 = new CustomerUser(mediator, "Customer 2");
        User customerUser3 = new CustomerUser(mediator, "Customer 3");
        User customerUser4 = new CustomerUser(mediator, "Customer 4");
        User customerUser5 = new CustomerUser(mediator, "Customer 5");

        mediator.addUser(adminUser);
        mediator.addUser(employeeUser1);
        mediator.addUser(employeeUser2);
        mediator.addUser(customerUser1);
        mediator.addUser(customerUser2);
        mediator.addUser(customerUser3);
        mediator.addUser(customerUser4);
        mediator.addUser(customerUser5);

        adminUser.send("Xin chào mọi người!!!");
    }

}
