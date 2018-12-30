package reflection;

import java.util.Arrays;
import java.util.List;

public class Username {

    String[] pwd;
    List<String> stringList;
    static final int finalField = 10;
    boolean flag2;
    Boolean flag;
    int id;

    String name;
    String email;
    List<Employee> employee;
    Person person;
    String[] array;
    Employee[] employeesArray;

    public Username(int id, String name, String email, List<Employee> employee,Person person) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.employee = employee;
        this.person = person;
    }


    public Username(List<String> stringList, boolean flag2, Boolean flag, int id, String name, String email, List<Employee> employee, Person person, String[] array, Employee[] employeesArray) {
        this.stringList = stringList;
        this.flag2 = flag2;
        this.flag = flag;
        this.id = id;
        this.name = name;
        this.email = email;
        this.employee = employee;
        this.person = person;
        this.array = array;
        this.employeesArray = employeesArray;
    }

    public Username(String[] pwd, List<String> stringList, boolean flag2, Boolean flag, int id, String name, String email, List<Employee> employee, Person person, String[] array, Employee[] employeesArray) {
        this.pwd = pwd;
        this.stringList = stringList;
        this.flag2 = flag2;
        this.flag = flag;
        this.id = id;
        this.name = name;
        this.email = email;
        this.employee = employee;
        this.person = person;
        this.array = array;
        this.employeesArray = employeesArray;
    }

    @Override
    public String toString() {
        return "Username{" +
                "pwd='" + Arrays.toString(pwd) + '\'' +
                ", stringList=" + stringList +
                ", flag2=" + flag2 +
                ", flag=" + flag +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", employee=" + employee +
                ", person=" + person +
                ", array=" + Arrays.toString(array) +
                ", employeesArray=" + Arrays.toString(employeesArray) +
                '}';
    }

    public Username() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
