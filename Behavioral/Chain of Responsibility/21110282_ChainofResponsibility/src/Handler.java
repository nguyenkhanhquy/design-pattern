public interface Handler {

    void handleRequest(Request request);
    void setNext(Handler next);

}
