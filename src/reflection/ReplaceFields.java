package reflection;

import string.SpecialCharReplacing;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReplaceFields {

    public static void main(String[] args) throws Exception {

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person(1,"Venkat&&",12.0);
        Person p2 = new Person(1,"Venkat&&",12.0);
        Person p3 = new Person(1,"Venkat&&",12.0);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Employee e1 = new Employee(1,"Venkat","Appnomic");
        Employee e2 = new Employee(2,"Venkat","Atos");

        FieldTest ft = new FieldTest();
        Class ftClass = ft.getClass();

        Field f1 = ftClass.getField("pub");
        f1.set(ft, "reflecting on life");
        String str1 = (String) f1.get(ft);
        System.out.println("pub field: " + str1);

        Field f2 = ftClass.getField("parentPub");
        f2.set(ft, "again");
        String str2 = (String) f2.get(ft);
        System.out.println("\nparentPub field: " + str2);

        try {
            System.out.println("\nThis will throw a NoSuchFieldException");
            Field f3 = ftClass.getField("pro");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
