package a10Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 */
public class Coder implements Observer{
    private String CoderName;

    public Coder(String coderName){
        CoderName = coderName;
    }

    @Override
    public void update(Observable o, Object arg) {
        String s = String.valueOf(arg);
        System.out.println(CoderName+ "收到了一条消息："+s);
    }
}
