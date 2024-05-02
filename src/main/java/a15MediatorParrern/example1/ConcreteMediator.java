package a15MediatorParrern.example1;

public class ConcreteMediator extends Mediator{
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
