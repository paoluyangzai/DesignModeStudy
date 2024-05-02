package a15MediatorParrern.example1;

public class ConcreteColleagueB extends Colleague{
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("同事B将信息传递给中介者处理");
    }
}
