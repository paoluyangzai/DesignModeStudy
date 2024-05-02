package a14visitorpattern;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> list = new LinkedList<>();

    public BusinessReport() {
        list.add(new Engineer("米老鼠"));
        list.add(new Engineer("唐老鸭"));
        list.add(new Manager("大洲"));
        list.add(new Manager("小胡"));
    }
    public void showReport(Visitor visitor){
        for (Staff staff:list){
            staff.accept(visitor);
        }
    }
}
