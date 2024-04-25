package a7IteratorPattern.example2;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;
    public final void handleRequest(AbstractRequest request){
        //看当前Handler的处理权限够不够处理提交上来的requst，级别够直接处理
        if (getHandleLevel()==request.getRequestLevel()){
            handle(request);
        }else {
            //级别不够，看有没有下一个权限更高的处理者，
            if (nextHandler!=null){
//                有的话，提交给下一个
                nextHandler.handleRequest(request);
            }else {
//                没有的话，处理不了
                System.out.println("这个问题在场各位都处理不了");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     * @return
     */
    protected abstract  int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}
