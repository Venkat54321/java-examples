package string;

public class ImmutableChecking {

    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = "Hai";
        String s2 = s1;

        s2 = "Hello";
        System.out.println(s2);
        System.out.println(s1);
    }
}
