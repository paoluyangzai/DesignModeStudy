package a7IteratorPattern.example3;

public class GroupLeader extends Leder{
    @Override
    protected String getCurrentLederSay(int money) {

        return "小组长说"+money+"太多了，我报不了，找经理吧";
    }

    @Override
    public int limit() {
        return 100;
    }

    @Override
    protected void handle(int money) {
        System.out.println("小组长报销了"+money);
    }
}
