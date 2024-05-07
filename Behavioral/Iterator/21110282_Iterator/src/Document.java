import java.util.ArrayList;
import java.util.List;

public class Document implements Iterable<Version> {

    private List<Version> versions;

    public Document() {
        versions = new ArrayList<>();
    }

    public void addVersion(Version version) {
        versions.add(version);
    }

    @Override
    public Iterator<Version> createIterator() {
        return new VersionIterator<>(versions);
    }

}
