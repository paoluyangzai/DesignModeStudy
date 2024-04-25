package a7IteratorPattern.example3;

public class Director extends Leder{
    @Override
    protected String getCurrentLederSay(int money) {
        return "经理说"+money+"太多了，我报不了，找老板吧";
    }

    @Override
    public int limit() {
        return 1000;
    }

    @Override
    protected void handle(int money) {
        System.out.println("经理报销了"+money);
    }
}
