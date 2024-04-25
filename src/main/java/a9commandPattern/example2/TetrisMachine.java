package a9commandPattern.example2;

public class TetrisMachine {
    /**
     * 真正处理向左操作的逻辑代码
     */
    public void toLeft(){
        System.out.println("向左移动");
    }
    /**
     *真正处理向右操作的逻辑代码
     */
    public void toRight(){
        System.out.println("向右移动");
    }
    /**
     *真正处理快速落下的逻辑代码
     */
    public void fastToBottom(){
        System.out.println("快速落下");
    }
    /**
     *真正处理改变形状的逻辑代码
     */
    public void transorm(){
        System.out.println("变形");
    }
}
