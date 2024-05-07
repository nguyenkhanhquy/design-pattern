import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand(int index) {
        if (index >= 0 && index < commands.size()) {
            commands.get(index).execute();
        } else {
            System.out.println("Invalid command index");
        }
    }

}
