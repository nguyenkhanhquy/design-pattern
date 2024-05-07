import java.util.ArrayList;
import java.util.List;

public class File implements Iterable<Version> {

    private final List<Version> versions;

    public File() {
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
