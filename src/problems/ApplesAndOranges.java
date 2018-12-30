package problems;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {

    public static void main(String[] args) {

        int[] apples = {-2};
        int[] oranes = {-1};

        count(2,3,1,5,apples,oranes);


    }

    public static void count(int s,int t,int a,int b,int[] apples,int[] oranges){

        List<Integer> appleIntergers = new ArrayList();
        List<Integer> orangeIntegers = new ArrayList();

        for(Integer apple: apples){
            appleIntergers.add(a + apple);
        }
        for(Integer orange: oranges){
            orangeIntegers.add(b + orange);
        }
        int appleCount = 0;
        int orangeCount = 0;

        for(Integer apple: appleIntergers){
            if(apple >= s){
                appleCount++;
            }
        }

        for(Integer orange: orangeIntegers){
            if(orange <= t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);

    }
}
