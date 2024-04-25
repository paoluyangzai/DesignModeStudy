package a7IteratorPattern.example2;

public class Handler2 extends AbstractHandler{
    @Override
    protected int getHandleLevel() {
        //Handler1具有2级处理权限
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2处理的请求为："+request.getRequestLevel());
    }
}
