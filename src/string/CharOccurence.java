package string;

public class CharOccurence {

    public static void main(String[] args){
        String s  = "Hai How are you!";
        Integer count = s.length() - s.replace("a","").length() ;
        System.out.print(count);
    }
}
