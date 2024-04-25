package a5strategy;

public class PriceCaluculator {
    //公交
    public static final int BUS = 1;
    //地铁
    public static final int SUBWAY = 2;

    public static void main(String[] args) {
        PriceCaluculator caluculator = new PriceCaluculator();
        System.out.println("坐16公里公交车的票价为：" + caluculator.calculatePrice(10, BUS));
    }

    /**
     * 北京公交车10公里内1元钱，超过十公里后每加一元钱可以乘5公里
     *
     * @param km
     * @return
     */
    private int busPrice(int km) {
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

    /**
     * 地铁 6公里内3元，6～12 4元 12～22 5元 22～32 6元
     *
     * @param km
     * @return
     */
    private int subwayPrice(int km) {
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

    int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        }

        return 0;
    }
}
