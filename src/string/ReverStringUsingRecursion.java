package string;

public class ReverStringUsingRecursion {

    public static void main(String[] args) {
        String s = "abcdef";
        String s1  = reverse(s);
        System.out.println(s1);
    }

    public static String reverse(String s){

        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
