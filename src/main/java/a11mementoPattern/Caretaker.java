package a11mementoPattern;

/**
 * 备忘录存取类
 */
public class Caretaker {
    Memoto mMemoto;//备忘录
    public void archive(Memoto memoto){
        this.mMemoto = memoto;
    }
    public Memoto getMemoto(){
        return mMemoto;
    }

}
