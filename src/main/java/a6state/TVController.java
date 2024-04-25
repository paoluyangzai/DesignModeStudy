package a6state;

/**
 * 电视机遥控器，含有开机，关机，下个台，上个台，加音量，减音量
 */
public class TVController {
    public static final int POWER_ON = 1;
    public static final int POWER_OFF = 2;

    private int mState = POWER_OFF;

    //开机
    public void setPowerOn() {
        mState = POWER_ON;
        if (mState == POWER_OFF) {
            System.out.println("开机啦");
        }
    }

    //关机
    public void setPowerOff() {
        mState = POWER_OFF;
        if (mState == POWER_ON) {
            System.out.println("关机啦");
        }
    }

    //下个台
    public void nextChannel() {
        if (mState==POWER_ON){
            System.out.println("下一频道");
        }else {
            System.out.println("没有开机，指令无效");
        }
    }

    //上个台
    public void prevChannel() {
        if (mState==POWER_ON){
            System.out.println("上一频道");
        }else {
            System.out.println("没有开机，指令无效");
        }
    }

    //加音量
    public void turnUp() {
        if (mState==POWER_ON){
            System.out.println("调高音量");
        }else {
            System.out.println("没有开机，指令无效");
        }
    }

    //减音量
    public void turnDown() {
        if (mState==POWER_ON){
            System.out.println("调低音量");
        }else {
            System.out.println("没有开机，指令无效");
        }
    }
}
