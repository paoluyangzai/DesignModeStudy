package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类式单例模式
 */
public class IdGeneratorJingTaiNeiBuLei {
    //将无参构造函数私有化
    private IdGeneratorJingTaiNeiBuLei() {}
    private AtomicLong id = new AtomicLong(0);

    public static IdGeneratorJingTaiNeiBuLei getInstance() {
        return IdGeneratorJingTaiNeiBuLeiHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    private static class IdGeneratorJingTaiNeiBuLeiHolder{
        public static final IdGeneratorJingTaiNeiBuLei instance = new IdGeneratorJingTaiNeiBuLei();
    }
}
