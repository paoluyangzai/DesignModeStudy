package a12Itertorpattern.example2;

import a12Itertorpattern.Employee;

public class CompanyHui implements Company{
    private Employee[] array = new Employee[6];

    public CompanyHui() {
        array[0] = new Employee("大红",30,"男","工程师");
        array[1] = new Employee("大橙",31,"女","工程师");
        array[2] = new Employee("大黄",32,"男","工程师");
        array[3] = new Employee("大绿",33,"女","工程师");
        array[4] = new Employee("大青",34,"男","工程师");
        array[5] = new Employee("大蓝",35,"女","工程师");
    }
    public Employee[] getEmployee(){
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
