package a9commandPattern.example1;

public class ConcreteCommand implements Command{
    private Receiver receiver;//只有一个对接受者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
