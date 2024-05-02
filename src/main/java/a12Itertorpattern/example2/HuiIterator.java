package a12Itertorpattern.example2;

import a12Itertorpattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class HuiIterator implements Iterator{
    private Employee[] array;
    private int position;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNest() {
         return !(position==array.length-1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee employee = array[position];
        position++;
        return employee;
    }
}
