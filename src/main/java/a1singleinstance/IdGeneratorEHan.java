package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式单例模式
 */
public class IdGeneratorEHan {
    //将无参构造函数私有化
    private IdGeneratorEHan() {
    }

    //静态私有化对象
    public static final IdGeneratorEHan instance = new IdGeneratorEHan();
    private AtomicLong id = new AtomicLong(0);

    public static IdGeneratorEHan getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
