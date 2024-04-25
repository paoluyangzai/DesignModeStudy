package a5strategy;

public class SubwayStrategy implements ICalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 7;
        }
        //其他距离都按7算吧
        return 7;
    }
}
