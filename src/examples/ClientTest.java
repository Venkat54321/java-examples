package examples;

import java.util.Map;
import java.util.Set;

public class ClientTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
        Employee e2 = new Employee(2009, "Ambay", 30000.00, "martin@infotech.com");
        Employee e3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");
        Employee e4 = new Employee(4009, "Boya", 70000.00, "harry@infotech.com");
        Employee e5 = new Employee(5009, "Sean", 80000.00, "sean@infotech.com");

        Department d1 = new Department(10001, "IT", "Boston");
        Department d2 = new Department(10002, "Finance", "Chennai");

        LRUCache<Employee, Department> cache = LRUCache.newInstance(1);

        cache.put(e1, d1);
        cache.put(e2, d1);
        cache.put(e3, d1);

        cache.put(e4, d2);
        cache.put(e5, d2);

        Set<Map.Entry<Employee, Department>> entrySet = cache.entrySet();
        for (Map.Entry<Employee, Department> entry : entrySet) {
            Employee employee = entry.getKey();
            Department department = entry.getValue();
            System.out.println(employee);
            System.out.println(department);
        }
    }
}
