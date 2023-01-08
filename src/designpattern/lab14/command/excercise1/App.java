package designpattern.lab14.command.excercise1;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Switch switcher = new Switch();


        Command command1 = new RestartCommand(computer1);
        Command command2 = new ShutDownCommand(computer1);

        switcher.storeAndExecute(command1);
        switcher.storeAndExecute(command2);
        System.out.println();

        switcher.reexecuteAllCommands();


    }
}
