package a15MediatorParrern.example2;

public abstract class Colleague {
    protected Mediator mediator;//每一个同事都该知道中介者
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
