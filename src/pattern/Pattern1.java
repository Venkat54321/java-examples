package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(1,1);
    }

    public static void pattern(int i,int x){
        if(i>3){
            return;
        }
        for(int j =0;j<i;j++){
            System.out.print(x +"  ");
            x++;
        }
        System.out.println("\n");
        pattern(i+1,x);
    }
}
