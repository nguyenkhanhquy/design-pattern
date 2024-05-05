public class Main {

    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem();

        // Yêu cầu xác thực
        AuthenticationRequest request1 = new AuthenticationRequest("customer123", "customerPassword", UserType.CUSTOMER);
        AuthenticationRequest request2 = new AuthenticationRequest("admin456", "adminPassword", UserType.ADMIN);
        AuthenticationRequest request3 = new AuthenticationRequest("employee789", "employeePassword", UserType.EMPLOYEE);

        // Xác thực
        authSystem.authenticate(request1);
        authSystem.authenticate(request2);
        authSystem.authenticate(request3);
    }

}
