package a5strategy;

public class BusStrategy implements  ICalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        //总里程-10
        int extraTotal = km - 10;
        //超过十公里部分
        int extraFactor = extraTotal / 5;
        //
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        //不足5公里按5公里算
        return fraction > 0 ? ++price : price;
    }
}
