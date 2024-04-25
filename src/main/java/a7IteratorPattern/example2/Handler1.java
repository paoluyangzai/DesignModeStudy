package a7IteratorPattern.example2;

public class Handler1 extends AbstractHandler{
    @Override
    protected int getHandleLevel() {
        //Handler1具有1级处理权限
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1处理的请求为："+request.getRequestLevel());
    }
}
