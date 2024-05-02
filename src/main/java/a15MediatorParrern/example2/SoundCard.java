package a15MediatorParrern.example2;

public class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频数据
     * @param data
     */
    public void soundPlay(String data){
        System.out.println("音频播放中:"+data);
    }
}
