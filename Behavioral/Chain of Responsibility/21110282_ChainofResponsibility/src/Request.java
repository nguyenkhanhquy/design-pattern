public class Request {

    private final String description;
    private final RequestType type;

    public Request(RequestType type, String description) {
        this.type = type;
        this.description = description;
    }

    public RequestType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
