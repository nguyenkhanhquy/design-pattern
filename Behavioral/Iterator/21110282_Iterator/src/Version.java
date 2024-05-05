public class Version {

    String content;

    String timestampl;

    public Version(String content, String timestampl) {
        this.content = content;
        this.timestampl = timestampl;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getContent() {
        return content;
    }

    public String getTimestampl() {
        return timestampl;
    }
}
