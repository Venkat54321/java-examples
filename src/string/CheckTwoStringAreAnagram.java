package string;

import java.util.Arrays;

public class CheckTwoStringAreAnagram {

    static int NO_OF_CHARS = 256;
    
    public static boolean isAnagram(char[] firstChars,char[] secondChars){

        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1,0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2,0);


        for(int i =0;i< firstChars.length && i < secondChars.length;i++){

            count1[firstChars[i]]++;
            count2[secondChars[i]]++;
        }

        if(firstChars.length != secondChars.length){
            return false;
        }

        for(int i =0;i<NO_OF_CHARS ;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramM2(char[] firstChars, char[] secondChars){

        int firstStrCount = 0;
        int secondStrCount = 0;

        for(int i =0;i<firstChars.length;i++){
            firstStrCount  = firstStrCount + firstChars[i];
        }

        for(int i =0;i<secondChars.length;i++){
            secondStrCount = secondStrCount + secondChars[i];
        }


        System.out.println("first Char count "+ firstStrCount);
        System.out.println("second Char count "+ secondStrCount);

        if(firstStrCount == secondStrCount){
            return true;
        }

        return false;

    }
    

    public static void main(String[] args) {

        String firstStr = "Hello";
        String secondStr = "ello";

        //boolean isAnagrame = isAnagram(firstStr.toCharArray(),secondStr.toCharArray());
        //System.out.println(isAnagrame);
        boolean isAnagramM2 = isAnagramM2(firstStr.toCharArray(),secondStr.toCharArray());
        System.out.println(isAnagramM2);
        

    }
}
