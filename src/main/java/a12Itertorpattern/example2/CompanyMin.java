package a12Itertorpattern.example2;

import a12Itertorpattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company{
    private List<Employee> list = new ArrayList<>();
    public CompanyMin(){
        list.add(new Employee("小明",20,"男","程序员"));
        list.add(new Employee("小红",21,"女","程序员"));
        list.add(new Employee("小绿",22,"男","程序员"));
        list.add(new Employee("小蓝",23,"女","程序员"));
        list.add(new Employee("小紫",24,"男","程序员"));
    }
    public List<Employee> getEmployee(){
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
