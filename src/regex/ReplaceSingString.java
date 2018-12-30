package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSingString {

    static String s = "[\\\"<>&']";
    private static Pattern pattern = Pattern.compile(s);

    public static void main(String[] args) {

        String s ="<>He&llo";

        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            s = s.replace(matcher.group(),"-");
        }

        System.out.println(s);
    }
}
