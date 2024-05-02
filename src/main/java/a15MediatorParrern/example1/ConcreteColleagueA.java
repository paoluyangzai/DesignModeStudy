package a15MediatorParrern.example1;

public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("同事A将信息传递给中介者处理");
    }

}
