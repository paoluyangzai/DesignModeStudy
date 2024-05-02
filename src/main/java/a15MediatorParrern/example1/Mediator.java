package a15MediatorParrern.example1;

public abstract class Mediator {
    protected ConcreteColleagueA concreteColleagueA;
    protected ConcreteColleagueB concreteColleagueB;
    public abstract void method();

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }
}
