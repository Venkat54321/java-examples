package string;

public class RemoveLeadingZeros {

    public static void main(String[] args) {
        String s = "000000123408992";
        int c = '9';
        System.out.println(c);
        char[] charArray = s.toCharArray();
        int i =0;
        for (;i<charArray.length;i++){
            if(charArray[i] =='0'){
                continue;
            }else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j = i;j<charArray.length;j++){
            sb.append(charArray[j]);
        }
        System.out.println(sb);
    }
}
