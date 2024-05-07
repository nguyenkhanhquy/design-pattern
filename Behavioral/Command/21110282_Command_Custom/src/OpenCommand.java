public class OpenCommand implements Command {

    private final Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }

}
