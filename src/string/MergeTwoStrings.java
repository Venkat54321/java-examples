package string;

public class MergeTwoStrings {

    public static void main(String[] args) {

        String s1 = "def";
        String s2 = "abcgh";
        String sb = mergeStrings(s1,s2);
        System.out.println(sb);
    }

    static String mergeStrings(String a, String b) {
        StringBuffer sb = new StringBuffer();

        char[] char1 = a.toCharArray();
        char[] char2 = b.toCharArray();
        int string1Len = char1.length;
        int string2Len = char2.length;
        if(string1Len > string2Len){
            int k;
            for(k=0;k<string2Len;k++){
                sb.append(char1[k]).append(char2[k]);
            }
            while(k < string1Len){
                sb.append(char1[k]);
                k++;
            }

        }else if(string2Len > string1Len){
            int k;
            for (k = 0; k < string1Len; k++) {
                sb.append(char1[k]).append(char2[k]);
            }
            while (k < string2Len) {
                sb.append(char2[k]);
                k++;
            }
        }else if(string1Len == string2Len){
            for(int k=0;k<string1Len;k++){
                sb.append(char1[k]).append(char2[k]);
            }
        }

        return sb.toString();

    }
}
