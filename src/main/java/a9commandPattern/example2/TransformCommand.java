package a9commandPattern.example2;

public class TransformCommand implements Command{
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void excute() {
        machine.transorm();
    }
}
