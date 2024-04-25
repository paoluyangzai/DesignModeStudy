package a7IteratorPattern.example1;


public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();

        //设置concreteHandler1的下一个节点
        concreteHandler1.successor = concreteHandler2;
        //设置concreteHandler2的下一个节点
        concreteHandler2.successor = concreteHandler1;
        concreteHandler1.handleRequest("ConcreteHandler2");
        concreteHandler2.handleRequest("ConcreteHandler2");

    }
}
