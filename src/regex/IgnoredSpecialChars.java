package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IgnoredSpecialChars {


    static String regex = "[\\[\\]<>#@!$%^&*+~`{}|.()=+?/,:;'-]";

    public static void main(String[] args) {

        checkMultipleStrings("Hello","Hi*","Venkat9");
        checkMultipleIntegers(123,344,45,"1234'");

    }

    static void checkMultipleStrings(String...s){

        for(String i : s) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(i);

            if (m.find()) {
                System.out.println(i +" is Ignored");
            } else {
                System.out.println(i +" is  Accepted");
            }
        }

    }

    static void checkMultipleIntegers(Object...list){

        for(Object i : list) {
            Pattern p = Pattern.compile(regex);
            String c = String.valueOf(i);
            Matcher m = p.matcher(c);

            if (m.find()) {
                System.out.println(i +" is Ignored");
            } else {
                System.out.println(i +" is  Accepted");
            }
        }

    }
}
