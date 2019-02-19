package arrays;

public class CharCount {

    private static void charCount(char[] chars) {
        int[] numbers = new int[26];
        for (int i = 0 ; i < chars.length ; i++) {
            numbers[chars[i]  - 97]++;
        }

        for (int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] != 0) {
                System.out.println((char) (i + 97) + "-" + numbers[i]);
            }
        }
    }
    public static void main(String[] args) {
        char[] chars = new char[] {'a','b','a','c','a','c'};
        charCount(chars);
    }
}
