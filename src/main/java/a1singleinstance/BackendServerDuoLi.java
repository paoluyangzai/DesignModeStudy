package a1singleinstance;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * 多例模式
 */
public class BackendServerDuoLi {
    private long serverNo;
    private String serverAddress;
    private static final int SERVER_COUNT = 3;
    private static final Map<Long,BackendServerDuoLi> serverInstances = new HashMap<>();

    static {
        serverInstances.put(1L,new BackendServerDuoLi(1L,"192.168.1.1"));
        serverInstances.put(2L,new BackendServerDuoLi(2L,"192.168.1.2"));
        serverInstances.put(3L,new BackendServerDuoLi(3L,"192.168.1.3"));
    }
    private BackendServerDuoLi(long serverNo,String serverAddress){
        this.serverNo = serverNo;
        this.serverAddress = serverAddress;
        System.out.println("服务器地址为："+serverAddress);
    }
    public static BackendServerDuoLi getInstances(long serverNo){
        return serverInstances.get(serverNo);
    }
    public static BackendServerDuoLi getRandomInstace(){
        Random random = new Random();
       long no =  random.nextInt(SERVER_COUNT)+1L;
       return serverInstances.get(no);
    }

    public long getServerNo() {
        return serverNo;
    }

    public String getServerAddress() {
        return serverAddress;
    }
}
