package a14visitorpattern;

/**
 * CEO访问者，只关心业绩
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师的名字："+engineer.name+"，业绩为"+ engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理的名字："+manager.name+"，业绩为"+ manager.kpi);
    }
}
