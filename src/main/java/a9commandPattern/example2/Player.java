package a9commandPattern.example2;

public class Player {
    public static void main(String[] args) {
        Buttons buttons = new Buttons();
        TetrisMachine machine = new TetrisMachine();
        buttons.setLeftCommand(new LeftCommand(machine));
        buttons.setRightCommand(new RightCommand(machine));
        buttons.setFallCommand(new FallCommand(machine));
        buttons.setTransformCommand(new TransformCommand(machine));
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();

    }
}
