package a7IteratorPattern.example3;

public abstract class Leder {
    protected Leder nextLeder;

    /**
     * 处理报账请求
     * @param money
     */
    public final void hadleRequest(int money){
        if (money<limit()){
            handle(money);
        }else {
            if (nextLeder!=null){
                System.out.println(getCurrentLederSay(money));
                nextLeder.hadleRequest(money);
            }else {
                System.out.println("钱太多了，没人能处理，找老总吧");
            }
        }
    }

    protected abstract String getCurrentLederSay(int money);

    //看看当前leder的额度权限
    public abstract int limit();
    //处理报账行为
    protected abstract void handle(int money);

}
