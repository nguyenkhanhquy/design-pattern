public interface Authenticator {

    boolean authenticate(AuthenticationRequest request);
    void setNextAuthenticator(Authenticator next);

}
