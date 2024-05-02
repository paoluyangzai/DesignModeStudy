package a12Itertorpattern;

import a12Itertorpattern.Employee;
import a12Itertorpattern.example1.CompanyHui;
import a12Itertorpattern.example1.CompanyMin;
import a12Itertorpattern.example2.Iterator;

import java.util.List;

public class Boss {

    public static void main(String[] args) {
        /**
         * 不使用迭代器，要查看两家公司的员工，需要遍历两次
         * @param args
         */
        CompanyMin companyMin = new CompanyMin();
        List<Employee> employee = companyMin.getEmployee();
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i).toString());
        }
        CompanyHui companyHui = new CompanyHui();
        Employee[] employee1 = companyHui.getEmployee();
        for (int i = 0; i < employee1.length; i++) {
            System.out.println(employee1[i].toString());
        }

        System.out.println("===================================");
        /**
         * 使用迭代器查看两家公司的员工
         * @param args
         */
        a12Itertorpattern.example2.CompanyMin companyMin1 = new a12Itertorpattern.example2.CompanyMin();
        Iterator iterator = companyMin1.iterator();
        while (iterator.hasNest()){
            System.out.println(iterator.next());
        }
        a12Itertorpattern.example2.CompanyHui companyHui1 = new a12Itertorpattern.example2.CompanyHui();
        Iterator iterator1 = companyHui1.iterator();
        while (iterator1.hasNest()){
            System.out.println(iterator1.next());
        }

    }
}
