package arrays;

import java.util.List;
import java.util.Stack;

public class NextGreateElement {

    public static void main(String[] args) {

        int[] array = {4, 5, 2, 25,3};

       // withTwoArray(array);
        withStack(array);


    }

    static void withStack(int[] array){

        List<Integer> stack = new Stack<>();

        stack.add(array[0]);
        int element,next;

        for(int i=1;i<array.length;i++){

            next = array[i];

            if(!stack.isEmpty()){

                element = ((Stack<Integer>) stack).pop();

                while (element < next){
                    System.out.println(element + " --> " + next);
                    if (stack.isEmpty())
                        break;
                    element = ((Stack<Integer>) stack).pop();
                }
                if (element > next)
                    ((Stack<Integer>) stack).push(element);
            }

            ((Stack<Integer>) stack).push(next);
        }
        while (!stack.isEmpty()){
            element = ((Stack<Integer>) stack).pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }

    }

    static void withTwoArray(int[] array){
        for(int i =0;i<array.length;i++){
            for(int j = i ;j < array.length;j++){
                if(array[j] > array[i]){
                    System.out.println(array[i] +" next greater element is  "+ array[j]);
                    break;
                }
            }
            System.out.println(array[i] +" next greater element is  "+ -1);
        }

    }
}
