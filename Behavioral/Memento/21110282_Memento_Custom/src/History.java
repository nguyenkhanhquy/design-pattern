import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<DocumentMemento> mementos = new ArrayList<>();

    public void saveMemento(DocumentMemento memento) {
        mementos.add(memento);
    }

    public DocumentMemento getMemento(int index) {
        return mementos.get(index);
    }

    public List<DocumentMemento> getMementos() {
        return mementos;
    }

}
