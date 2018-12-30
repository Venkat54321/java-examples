package string;

public class CountWords {

    public static void main(String[] args){
        String s ="Hello how are you!";
        int count = 1;
        for(int i=0;i<s.length() -1;i++){
            if(s.charAt(i) == ' '){
                count ++;
            }
        }

        System.out.print(count);
    }
}
