package a9commandPattern.example2;

import a9commandPattern.example1.Command;

public class LeftCommand implements Command {
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
