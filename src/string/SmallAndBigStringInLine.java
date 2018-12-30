package string;

public class SmallAndBigStringInLine {

    public static void main(String[] args) {
        String line = "This problem is solved at Algorithms tutorial horizon";
        String small= "";
        String big = "";
        int smallLength = Integer.MAX_VALUE;
        int bigLength = 0;

        String[] stringList = line.split(" ");
        for(String s : stringList){
            int len = s.length();
            if(len < smallLength){
                smallLength = len;
                small = s;
            }
            if(len > bigLength){
                bigLength = len;
                big = s;
            }
        }
        System.out.println(line);
        System.out.println(small);
        System.out.println(big);


    }
}
