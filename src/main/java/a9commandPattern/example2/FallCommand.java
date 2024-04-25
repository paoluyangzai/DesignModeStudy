package a9commandPattern.example2;

public class FallCommand implements Command{
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        machine.fastToBottom();
    }
}
