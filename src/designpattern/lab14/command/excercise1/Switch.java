package designpattern.lab14.command.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> commands;
    public Switch() {
        commands = new ArrayList<>();
    }

    public void store(Command command) {
        commands.add(command);
    }

    public void execute(Command command) {
        command.execute();
    }

    public void storeAndExecute(Command command) {
        execute(command);
        store(command);
    }

    public void reexecuteAllCommands() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
