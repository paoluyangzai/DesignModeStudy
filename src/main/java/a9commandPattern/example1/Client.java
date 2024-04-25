package a9commandPattern.example1;

public class Client {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(concreteCommand);
        invoker.action();
    }
}
