package examples;

public class MergeTwoArraysMethod1 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,4};
        int[] array2 = {4,5,6,7,8,9,10};
        //result {1,2,3,4,5,6,7,8,9,10}

        int[] array3 = new int[array1.length + array2.length];
        for(int i=0;i<array1.length;i++){
           array3[i] = array1[i];
        }

        int arrayOneLenght = array1.length;

        for(int j=0;j<array3.length;j++) {
            for (int i = 0; i < array2.length; i++) {
                boolean isPresent = checkElementAvailble(array3, array2[i]);
                if (!isPresent) {
                    array3[arrayOneLenght++] = array2[i];
                }
            }
        }

        for(int i:array3){
            System.out.println(i);
        }

    }


    static boolean checkElementAvailble(int[] array,int value){
        for(int i: array){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
