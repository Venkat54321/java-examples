package examples;

import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;

public class MatrixExample {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

       list.add(5);
        list.add(6);
        list.add(7);

        list1.add(3);
        list1.add(6);
        list1.add(10);

        List<Integer> list3 = getList(list,list1);

        System.out.println(list3);

    }

    static List<Integer> getList(List<Integer> a,List<Integer> b){

        int firstValue = 0;
        int SecondValue = 0;
        List<Integer> list = new ArrayList<>();

        for(int i =0;i<3;i++){
            if(a.get(i) > b.get(i)){
                firstValue = firstValue +1;
            }else if(a.get(i) < b.get(i)){
                SecondValue = SecondValue +1;
            }
        }

        list.add(firstValue);
        list.add(SecondValue);

        return list;
    }
}
