package problems;

public class SupportedNumber {

    public static void main(String[] args) {

        int n = 12;
        int count = 0;
        while (n > 0){
            n = n/2;
            count++;
        }

        System.out.println(count);
    }

}
