package a8InterpreterPattern;

public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法，具体的解析逻辑由子类实现
     * @return
     */
    public abstract int interpret();
}
