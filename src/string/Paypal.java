package string;

public class Paypal {

    public static void main(String[] args) {
        String s = "ABCDE";
        int middle = s.length()/2;
        Character middleChar = null;
        if(s.length()%2 != 0){
            middleChar= s.charAt(middle);
        }
        System.out.println(middleChar);
        StringBuilder finalString = new StringBuilder();
        for(int i=0,j=s.length();i<middle && j>middle;i=i+2,j=j-2){

            System.out.println();

            finalString.append(s, j - 2, j);
            if(j-3 == middle){
                finalString.append(middleChar);
            }
            finalString.append(s, i, i+2);
        }
        System.out.println(finalString);
    }
}
