package a12Itertorpattern.example2;

public interface Iterator {
    /**
     * 是否还有下一个元素
     */
    boolean hasNest();
    /**
     * 返回当前位置的元素，并将位置移至下一位
     */
    Object next();
}
