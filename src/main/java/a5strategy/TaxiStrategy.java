package a5strategy;

public class TaxiStrategy implements ICalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        //一公里两块
        return km*2;
    }
}
