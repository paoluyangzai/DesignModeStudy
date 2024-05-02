package a14visitorpattern;

public interface Visitor {
    public void visit(Engineer engineer);
    public void visit(Manager manager);
}
