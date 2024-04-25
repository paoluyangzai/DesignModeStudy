package a7IteratorPattern.example2;

public class Request4 extends AbstractRequest{

    public Request4(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 4;
    }
}
