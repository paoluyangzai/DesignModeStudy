package a7IteratorPattern.example2;

public class Client {
    public static void main(String[] args) {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.nextHandler=handler2;
        handler2.nextHandler = handler3;

        Request1 request1 = new Request1("Request1");
        Request2 request2 = new Request2("Request2");
        Request3 request3 = new Request3("Request3");
        Request4 request4 = new Request4("Request4");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
        handler1.handleRequest(request4);
    }
}
