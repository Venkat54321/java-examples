package farid;

public class ExtractNumberInString {

    public static void main(String[] args) {

        String s ="ABC12ZY";
        char[] characters = s.toCharArray();

        for (char c: characters){
           if(Character.isDigit(c)) {
               System.out.println(c);
           }
        }

    }
}
