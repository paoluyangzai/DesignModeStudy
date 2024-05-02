package a13templatepattern;

public abstract class AbstractComputer {
    void powerOn(){
        System.out.println("开启电源");
    }
    void checkHardware(){
        System.out.println("检查硬件");
    }
    void loadOS(){
        System.out.println("加载系统");
    }
    void login(){
        System.out.println("用户登录");
    }

    /**
     * 固定的步骤集成到这里了，不可改变
     */
    public final void startUp(){
        System.out.println("--------开机Start--------");
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}
