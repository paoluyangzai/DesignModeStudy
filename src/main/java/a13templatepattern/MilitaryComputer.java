package a13templatepattern;

public class MilitaryComputer extends AbstractComputer{
    @Override
    void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    void login() {
        System.out.println("进行指纹识别等复杂验证");

    }
}
