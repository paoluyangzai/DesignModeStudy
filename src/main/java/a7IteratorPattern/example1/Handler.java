package a7IteratorPattern.example1;

public abstract class Handler {
    protected Handler successor;//下一节点的处理者
    public abstract void handleRequest(String condition);
}
