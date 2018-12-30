package regex;

import string.SpecialCharReplacing;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupsExample {

    static Pattern pattern = Pattern.compile("([\"<&>'])");

    public static void main(String[] args) {
        String s = "<ven&kat'\"";
        // < ===> &lt;  &apmt;
        Matcher matcher = pattern.matcher(s);

        if(s.contains("&")){
            s = s.replace("&",SpecialCharReplacing.map.get("&"));
        }
            while (matcher.find()) {
                if(!matcher.group().equals("&")) {
                   // System.out.println("Special character :" + "  " + matcher.group() + " START :" + matcher.start() + "END : " + matcher.end());
                    s = s.replace(matcher.group(), SpecialCharReplacing.map.get(matcher.group()));
                }
            }

        System.out.println(s);
    }
}

class IndexNumber{

    String chars;
    Integer start;
    Integer end;

    public IndexNumber(String chars, Integer start, Integer end) {
        this.chars = chars;
        this.start = start;
        this.end = end;
    }
}