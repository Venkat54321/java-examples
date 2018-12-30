package examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeListSort {

    public static void main(String[] args){
        List<Employee1> employeeList = new ArrayList<>();

        employeeList.add(new Employee1(10,"venkat","bng"));
        employeeList.add(new Employee1(15,"abc","hyd"));
        employeeList.add( new Employee1(14,"zxy","chennai"));

        Comparator<Employee1> customComparator = new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                return o1.city.compareTo(o2.city);
            }
        };

        System.out.println("Before : "+employeeList);

        employeeList.sort(customComparator);

        System.out.println("After : "+employeeList);




    }
}
