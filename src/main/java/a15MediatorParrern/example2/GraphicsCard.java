package a15MediatorParrern.example2;

public class GraphicsCard extends Colleague{
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 视频播放
     * @param data
     */
    public void videoPlay(String data){
        System.out.println("视频播放中："+data);
    }
}
