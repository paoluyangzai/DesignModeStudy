package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 集群下的单例模式，也就是进程间唯一，使用方法如下：
 *
 *     IdGeneratorJiQun idGeneratorJiQun = IdGeneratorJiQun.getInstance()
 *        long id =  idGeneratorJiQun.getId();
 *         idGeneratorJiQun.freeInstance();//使用完毕要释放对象
 *
 *
 *         部分包不知道引用了哪个框架，都注释了
 */



public class IdGeneratorJiQun {
    private IdGeneratorJiQun(){}
    private AtomicLong id = new AtomicLong();
    private static IdGeneratorJiQun instance;
//    private static SharedObjectStorage storage = FileSharedObjectStorage(/*入参是文件地址之类*/);
//    private  static  DistributedLock lock = new DistributedLock();
    public synchronized static IdGeneratorJiQun getInstance(){
        if (instance==null){
//            lock.lock();
//            instance = storage.load(IdGeneratorJiQun.class);
        }
        return instance;
    }
    public long getId (){
        return id.incrementAndGet();
    }
    public synchronized void freeInstance(){
//        storage.save(this,IdGeneratorJiQun.class);
        instance = null;//释放对象
//        lock.unlock();
    }
}
