package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        List ll = new ArrayList();


        ll.add("8");
        ll.add("20");
        Collections.sort(ll);

        for(int i =0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }

}
