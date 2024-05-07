public class CloseCommand implements Command {

    private final Document document;

    public CloseCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.close();
    }

}
