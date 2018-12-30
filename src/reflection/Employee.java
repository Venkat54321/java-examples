package reflection;

import java.util.List;

public class Employee {

    private int id;
    public String name;
    public String company;
    boolean flag;
    Boolean flag2;
   // List<Person> personList;

    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }


    public Employee(int id, String name, String company, boolean flag) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.flag = flag;
    }

    public Employee(int id, String name, String company, boolean flag, Boolean flag2) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.flag = flag;
        this.flag2 = flag2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
