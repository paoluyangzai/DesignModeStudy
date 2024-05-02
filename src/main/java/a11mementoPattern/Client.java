package a11mementoPattern;

public class Client {
    public static void main(String[] args) {
        CallOfDuty callOfDuty = new CallOfDuty();
        callOfDuty.play();
        Caretaker caretaker = new Caretaker();
        caretaker.archive(callOfDuty.createMemoto());
        callOfDuty.quit();
        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore(caretaker.mMemoto);
    }
}
