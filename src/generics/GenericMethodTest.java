package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

    public static void main(String[] args) {

        List<String> stringList = geneticMethod("hai","Hello");
        System.out.println(stringList);
        List<Integer> intergerList = geneticMethod(1,2);
        System.out.println(intergerList);
    }

    public static <T> List<T> geneticMethod(T t1,T t2){

        List<T> genericList = new ArrayList<>();
        genericList.add(t1);
        genericList.add(t2);

        return genericList;

    }
}
