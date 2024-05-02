package a12Itertorpattern.example2;

import a12Itertorpattern.Employee;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class MinIterator implements Iterator{
    private List<Employee> list  = new ArrayList<>();
    private int position;

    public MinIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNest() {
         return !(position==list.size()-1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;
        return employee;
    }
}
