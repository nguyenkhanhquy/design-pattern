public class AdminAuthenticator implements Authenticator {

    private Authenticator next;

    @Override
    public boolean authenticate(AuthenticationRequest request) {
        if (request.getUserType() == UserType.ADMIN) {
            // Xử lý xác thực cho quản trị viên
            System.out.println("Authenticating admin: " + request.getUsername());
            return true;
        }
        // Nếu không phải là quản trị viên, chuyển yêu cầu cho lớp xác thực tiếp theo trong chuỗi
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
