package javaexamples;

public class NumberBetween {

    public static void main(String[] args) {

        int i = 20;//current app
        int j = 100;//kpi time
        int k = 100 - 50;


        if(i <= j && i >= k){
            System.out.println(i + " is between "+ j +" and "+k);
        }else{
            System.out.println("no");
        }

    }
}
