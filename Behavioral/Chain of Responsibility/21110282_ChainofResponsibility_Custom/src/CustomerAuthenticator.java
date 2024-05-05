public class CustomerAuthenticator implements Authenticator {

    private Authenticator next;

    @Override
    public boolean authenticate(AuthenticationRequest request) {
        if (request.getUserType() == UserType.CUSTOMER) {
            // Xử lý xác thực cho khách hàng
            System.out.println("Authenticating customer: " + request.getUsername());
            return true;
        }
        // Nếu không phải là khách hàng, chuyển yêu cầu cho lớp xác thực tiếp theo trong chuỗi
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
