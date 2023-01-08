package designpattern.lab14.command.excercise1;

public class RestartCommand implements Command{
    private Computer computer;
    public RestartCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.restart();
    }
}
