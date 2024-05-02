package a15MediatorParrern.example2;

public abstract class Mediator {
    /**
     * 同事对象改变时通知中介者的方法
     * @param c
     */
    public abstract void changed(Colleague c);
}
