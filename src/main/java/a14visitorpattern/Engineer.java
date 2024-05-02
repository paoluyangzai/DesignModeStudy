package a14visitorpattern;

import java.util.Random;

public class Engineer extends Staff{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 代码行数
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(1000);
    }
}
