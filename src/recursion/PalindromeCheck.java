package recursion;

public class PalindromeCheck {

    public static void main(String[] args) {
        String s = "12321";
        boolean isPalindrom = isPalindrome(s,0,s.length()-1);
        System.out.println(isPalindrom);
    }

    public static boolean isPalindrome(String s,int i,int j) {

        if (i >= j) {
            return false;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        isPalindrome(s, ++i, --j);

        return true;
    }
}
