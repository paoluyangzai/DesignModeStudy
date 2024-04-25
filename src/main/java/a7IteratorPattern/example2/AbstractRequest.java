package a7IteratorPattern.example2;

public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 具体的内容对象
     * @return
     */
    public Object getObj() {
        return obj;
    }

    /**
     * 获取请求级别
     * @return
     */
    public abstract  int getRequestLevel();
}
