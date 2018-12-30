package string;

public class CheckTwoStrringsAnagram {

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "ILETSN";
        int sum = 0;
        for(int i=0;i<str1.length()-1;i++){
            sum = sum + str2.charAt(i);
        }
        System.out.println(sum);
    }
}
