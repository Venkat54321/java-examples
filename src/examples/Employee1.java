package examples;

public class Employee1 implements Comparable<Employee1> {

    Integer id;
    String name;
    String city;

    public Employee1(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
        return this.name.compareTo(o.name);
    }

}
