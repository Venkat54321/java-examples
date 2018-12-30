package examples;

public class Test2 {

    public static void main(String[] args) {
        Long l = null;

        Long l2 = 1233444l;
        Long l3 = null;


        if(l != null && l2 != null) {
            l3 = l2 > l ? l2 : l;
        }

        System.out.println(l3);

    }
}
