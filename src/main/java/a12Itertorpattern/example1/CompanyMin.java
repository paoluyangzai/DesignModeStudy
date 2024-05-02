package a12Itertorpattern.example1;

import a12Itertorpattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin {
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
}
