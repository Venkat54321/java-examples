package sorting;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}


public class SortArrayObject {

    public static void main(String[] args) {

        Employee e1 =new Employee(3,"Venkat3",2.3);
        Employee e2 =new Employee(2,"Venkat2",2.3);
        Employee e3 =new Employee(1,"Venkat1",2.3);

        Employee[] employees = new Employee[3];

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        Arrays.sort(employees, Comparator.comparing(o -> o.name));

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
