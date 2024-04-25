package a5strategy;

/**
 * 策略模式
 */
public class TranficCalucator {
    public static void main(String[] args) {
        TranficCalucator calculator = new TranficCalucator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("坐了18公里公交车的票价为"+ calculator.calculatePrice(18));
        calculator.setStrategy(new TaxiStrategy());
        System.out.println("坐了18公里出租车的票价为"+calculator.calculatePrice(18));

    }
    ICalculateStrategy mStrategy;
    private void setStrategy(ICalculateStrategy strategy) {
        this.mStrategy = strategy;
    }
    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }



}
