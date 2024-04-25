package a9commandPattern.example2;

public class RightCommand implements Command {
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        machine.toRight();
    }
}
