import java.util.List;

public class class VersionIterator<T> implements Iterator<T> {

    private List<Version> versions;
    private int position;

    public VersionIterator(List<Version> versions) {
        this.versions = versions;
        this.position = 0;
    }

    // Kiểm tra xem còn phiên bản tiếp theo hay không
    public boolean hasNext() {
        return position < versions.size();
    }

    // Trả về phiên bản tiếp theo
    public T next() {
        if (hasNext()) {
            T version = (T) versions.get(position);
            position++;
            return version;
        }
        throw new IllegalStateException("No more versions available.");
    }

}
