package a15MediatorParrern.example1;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事角色的具体行为，由子类去实现
     */
    public abstract void action();
}
