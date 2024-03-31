package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举式单例模式
 */
public enum IdGeneratorMeiJu {
    INSTANCE;
    //将无参构造函数私有化
    private IdGeneratorMeiJu() {
    }
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
