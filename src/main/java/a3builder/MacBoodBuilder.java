package a3builder;

public class MacBoodBuilder extends Builder{
    private Computer mComputer = new MacBook();
    @Override
    public Builder buildBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setmOS("");
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
