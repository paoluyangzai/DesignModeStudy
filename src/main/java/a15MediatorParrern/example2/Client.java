package a15MediatorParrern.example2;

public class Client {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        mainBoard.setCpu(new CPU(mainBoard));
        CDDevice cdDevice = new CDDevice(mainBoard);
        mainBoard.setCdDevice(cdDevice);
        mainBoard.setGraphicsCard(new GraphicsCard(mainBoard));
        mainBoard.setSoundCard(new SoundCard(mainBoard));

        cdDevice.load();

    }
}
