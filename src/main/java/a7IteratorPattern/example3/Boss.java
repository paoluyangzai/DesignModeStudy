package a7IteratorPattern.example3;

public class Boss extends Leder{
    @Override
    protected String getCurrentLederSay(int money) {
        return "老板说：不就是"+money+"吗，报！";
    }

    @Override
    public int limit() {
            return Integer.MAX_VALUE;
    }

    @Override
    protected void handle(int money) {
        System.out.println(getCurrentLederSay(money));
        System.out.println("老板报销了"+money);
    }
}
