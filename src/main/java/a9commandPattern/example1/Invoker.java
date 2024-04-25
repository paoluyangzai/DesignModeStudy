package a9commandPattern.example1;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action(){
        command.execute();
    }
}
