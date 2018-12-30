package examples;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArraySort {

    public static void main(String[] args){

        Employee1[] employees = new Employee1[3];

        employees[0] = new Employee1(10,"venkat","bng");
        employees[1] = new Employee1(15,"abc","hyd");
        employees[2] = new Employee1(14,"zxy","chennai");

        Comparator<Employee1> customComparator = new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
               return o1.city.compareTo(o2.city);
            }
        };


        System.out.println("Before " +Arrays.toString(employees));

        Arrays.sort(employees,customComparator);

        System.out.println("After "+Arrays.toString(employees));

    }
}
