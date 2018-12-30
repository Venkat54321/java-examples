package examples;

import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        String s = "22";

        String[] list = s.split(",");

        for(String s1 : list){
            System.out.println(s1);
        }
    }
}
