public class EmployeeAuthenticator implements Authenticator {

    private Authenticator next;

    @Override
    public boolean authenticate(AuthenticationRequest request) {
        if (request.getUserType() == UserType.EMPLOYEE) {
            // Xử lý xác thực cho nhân viên
            System.out.println("Authenticating employee: " + request.getUsername());
            return true;
        }
        // Nếu không phải là nhân viên, chuyển yêu cầu cho lớp xác thực tiếp theo trong chuỗi
        if (next != null) {
            return next.authenticate(request);
        }
        return false;
    }

    @Override
    public void setNextAuthenticator(Authenticator next) {
        this.next = next;
    }

}
