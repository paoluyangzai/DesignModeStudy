package a7IteratorPattern.example2;

public class Handler3 extends AbstractHandler{
    @Override
    protected int getHandleLevel() {
        //Handler1具有3级处理权限
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3处理的请求为："+request.getRequestLevel());
    }
}
