package recursion;

public class PrintStars {

    public static void main(String[] args) {
        int n =10;
        printStarts(n);
    }

    public static void printStarts(int n){
        while (true) {
            if(n >= 1){
                for(int i=n;i>0;i--) {
                    System.out.print("*");
                }
                System.out.println(" ");
                n = n-1;
            }else return;
        }

    }
}
