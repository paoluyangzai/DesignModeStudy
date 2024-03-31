package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;
/**
 * 懒汉式单例模式
 */
public class IdGeneratorLanHan {
    private AtomicLong id  = new AtomicLong(0);
    public static  IdGeneratorLanHan instance;

    private IdGeneratorLanHan() {
    }

    public static synchronized IdGeneratorLanHan getInstance(){
        if (instance==null) {
            instance = new IdGeneratorLanHan();
        }
        return  instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
