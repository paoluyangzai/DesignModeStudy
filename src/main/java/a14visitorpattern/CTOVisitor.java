package a14visitorpattern;

public class CTOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+"代码行数为："+engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+manager.name+"产品数为："+manager.getProducts());
    }
}
