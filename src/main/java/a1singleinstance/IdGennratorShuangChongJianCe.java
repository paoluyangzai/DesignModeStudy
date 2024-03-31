package a1singleinstance;

import java.util.concurrent.atomic.AtomicLong;
/**
 * 双重检测式单例模式
 */
public class IdGennratorShuangChongJianCe {
    private IdGennratorShuangChongJianCe(){}
    private AtomicLong id = new AtomicLong(0);
    private static IdGennratorShuangChongJianCe instance;
    public static final IdGennratorShuangChongJianCe getInstance(){
        if (instance==null){
            synchronized (IdGennratorShuangChongJianCe.class){
                if (instance==null){
                    instance = new IdGennratorShuangChongJianCe();
                }
            }
        }
        return  instance;
    }
    public long getId(){
        return  id.incrementAndGet();
    }
}
