public class Version {

    String content;
    String timestamp;

    public Version(String content, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Version{" +
                "content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

}
