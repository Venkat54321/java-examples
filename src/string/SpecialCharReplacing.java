package string;

import reflection.Employee;
import reflection.Person;
import reflection.Username;

import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharReplacing {

    static Pattern pattern = Pattern.compile("([\"<&>'])");
    static List<String> list = new ArrayList<>();
    static List<String> stringList = new ArrayList<>();
    static List<String> ignoreFieldName = new ArrayList<>();

    static {
        list.add("int");
        list.add("java.lang.Integer");
        list.add("double");
        list.add("java.lang.Double");
        list.add("java.lang.Boolean");

        stringList.add("java.lang.String");
        ignoreFieldName.add("password");
        ignoreFieldName.add("pwd");

    }

    public static Map<String, String> map = getHtmlCodes();

    public static void main(String[] args) throws Exception {

        String[] array = {};


        Employee[] employeesArray = new Employee[2];

        List<Employee> employeeList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person(1, "<Venkat", 12.0);
        Person p2 = new Person(1, "Venkat&", 12.0);
        Person p3 = new Person(1, "\"Venkat", 12.0);

        List<Person> personList1 = new ArrayList<>();

        Person p4 = new Person(1, "Venkat&", 12.0);
        Person p5 = new Person(1, "Venkat&", 12.0);
        Person p6 = new Person(1, "Venkat&", 12.0);

        personList1.add(p4);
        personList1.add(p5);
        personList1.add(p6);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Employee e1 = new Employee(111, ">", "&appnomic");
        Employee e2 = new Employee(222, "<", "\"appnomi&c");
        Employee e3 = new Employee(333, "'Venkat>", "'appnomic", true, false);

        employeesArray[0] = e1;
        employeesArray[1] = e2;

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello>|Hi&");
        stringList.add("Hello>|Hi&");


        String[] stringArray = {"Hello><","<>"};

        Username user = new Username(null,stringList,true, true, 222, null, "&venkat@gmail.com", employeeList, p1, array, employeesArray);



        // getInstance(Username.class,user);

       //  String s10 = validateMultipleInputs(null);
        getInstance(Username.class, user);

        System.out.println(user);


    }

    public static <T> void getInstance(Class<?> clazz, T sampleObject) throws Exception {

        if (sampleObject instanceof String[]) {

            int size = ((Object[]) sampleObject).length;
            if (size > 0) {
                String type = ((Object[]) sampleObject)[0].getClass().getName();

                Class clazz2 = Class.forName(type);

                for (int i = 0; i < size; i++) {

                    if (stringList.contains(type)) {
                        ((Object[]) sampleObject)[i] = validateMultipleInputs(((String[]) sampleObject)[i]);
                    } else if (!list.contains(type)) {
                        getInstance(clazz2, ((Object[]) sampleObject)[i]);
                    } else{
                        System.out.println("Ignoring the type : " + type);
                    }
                }
            }

        } else if (sampleObject instanceof List) {

            int size = ((List) sampleObject).size();
            String type = ((ArrayList) sampleObject).get(0).getClass().getName();

            Class clazz2 = Class.forName(type);

            for (int i = 0; i < size; i++) {
                if(stringList.contains(type)){
                    ((ArrayList) sampleObject).set(i,validateMultipleInputs(((ArrayList) sampleObject).get(i)));
                }else if(list.contains(type)) {
                    getInstance(clazz2, ((List) sampleObject).get(i));
                }
            }

        } else {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.getName() + " " + field.getType().getName());

                if(ignoreFieldName.contains(field.getName())) {
                    System.out.println("Ignoring pwd field");
                    continue;
                }
                if (stringList.contains(field.getType().getName()))
                    field.set(sampleObject, validateMultipleInputs(field.get(sampleObject)));
                else if (!list.contains(field.getType().getName())) {
                    getInstance(field.getType(), field.get(sampleObject));
                } else {
                    System.out.println("Ignoring the type : " + field.getType().getName());
                }
            }
        }
    }


    static boolean isParameterValid(Object parameter) {

        String paramStr = String.valueOf(parameter);
        Matcher matcher = pattern.matcher(paramStr);
        return !matcher.find();
    }

    public static String validateMultipleInputs(Object value) {

        String paramStr = null;

        try {

            if (value == null) {
                return null;
            }
            if ("".equalsIgnoreCase(value.toString()))
                return "";

            boolean isValidParam = isParameterValid(value);

            paramStr = String.valueOf(value);
            Matcher matcher = pattern.matcher(paramStr);

            if (isValidParam) {
                return value.toString();
            }

            if (paramStr.contains("&")) {
                paramStr = paramStr.replace("&", map.get("&"));
            }

            while (matcher.find()) {
                if (!matcher.group().equals("&")) {
                    //  System.out.println("Special character :" + "  " + matcher.group() + " START :" + matcher.start() + "END : " + matcher.end());
                    paramStr = paramStr.replace(matcher.group(), map.get(matcher.group()));
                }
            }

        } catch (Exception e) {

        }
        return paramStr;
    }

    static Map<String, String> getHtmlCodes() {

        String HTML_CODES_DEFAULT = "<#&lt;,>#&gt;,&#&amp;,'#&apos;,\"#&quot;";

        String[] array = HTML_CODES_DEFAULT.split(",");
        Map<String, String> map = new HashMap<>();

        for (String s : array) {
            String[] split = s.split("#");
            map.put(split[0], split[1]);
        }

        return map;
    }
}
