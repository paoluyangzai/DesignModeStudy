package a1singleinstance;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 线程内唯一，进程内不唯一的单例模式
 */
public class IdGeneratorXianChengWeiYi {
    private AtomicLong id =new AtomicLong(0);
    //ConcurrentHashMap 一个支持高并发的哈希表
    private static final ConcurrentHashMap<Long,IdGeneratorXianChengWeiYi> instances = new ConcurrentHashMap<>();

    private IdGeneratorXianChengWeiYi(){}
    public static IdGeneratorXianChengWeiYi getInstance(){
        long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId,new IdGeneratorXianChengWeiYi());
        return instances.get(currentThreadId);
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
