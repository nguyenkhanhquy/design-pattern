public class AuthenticationSystem {

    private final Authenticator authenticatorChain;

    public AuthenticationSystem() {
        Authenticator customerAuthenticator = new CustomerAuthenticator();
        Authenticator employeeAuthenticator = new EmployeeAuthenticator();
        Authenticator adminAuthenticator = new AdminAuthenticator();

        // Xác định chuỗi xác thực
        customerAuthenticator.setNextAuthenticator(employeeAuthenticator);
        employeeAuthenticator.setNextAuthenticator(adminAuthenticator);

        this.authenticatorChain = customerAuthenticator;
    }

    public void authenticate(AuthenticationRequest request) {
        authenticatorChain.authenticate(request);
    }

}
