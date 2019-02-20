package java8.venkatsubramanya;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class JavaStreamsList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,8);

        //
       /* list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        });*/

        IntStream.range(0,list.size())
                 .forEach(e -> System.out.print(e+ "  "));

        //list.forEach(integer -> System.out.print(integer+"  "));
        System.out.println( list.stream()
                   .reduce(0,(total,e) -> Integer.sum(total,e))
        );
    }
}
