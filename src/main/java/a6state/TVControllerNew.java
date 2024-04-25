package a6state;

public class TVControllerNew implements IPowerController{


    ITVState mTvState;
    public void setmTvState(ITVState mTvState) {
        this.mTvState = mTvState;
    }
    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setmTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void preChannel(){
        mTvState.preChannel();
    }
    public void turnUp(){
        mTvState.turnUp();
    }
    public void turnDown(){
        mTvState.turnDown();
    }
}
