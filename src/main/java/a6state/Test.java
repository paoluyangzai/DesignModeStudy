package a6state;

public class Test {
    public static void main(String[] args) {
        TVControllerNew tvControllerNew = new TVControllerNew();
        tvControllerNew.powerOn();
        tvControllerNew.nextChannel();
        tvControllerNew.preChannel();
        tvControllerNew.turnUp();
        tvControllerNew.turnDown();
        tvControllerNew.powerOff();
    }
}
