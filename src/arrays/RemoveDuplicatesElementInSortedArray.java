package arrays;

public class RemoveDuplicatesElementInSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 8, 8, 9};

        //with auxiliary array
        //int[] newArray = method1(array);

        //without auxiliary array
        int j = method2(array);

        for (int i=0;i<j;i++) {
            System.out.print(" " + array[i]);
        }
    }


      public static int method2(int[] array){

        int i =0,j=0;
        for(;i<array.length-1;i++){
            if(array[i+1] == array[i]){
                continue;
            }else {
                array[j] = array[i];
                j++;
            }
        }

        return j;
      }
        public static int[] method1(int[] array){
            int[] newArray = new int[array.length];

            int j =0;
            for(int i =0;i<array.length-1;i++){
                if(array[i+1] == array[i]){
                    continue;
                }else {
                    newArray[j] = array[i];
                    j++;
                }
            }
            newArray[j] = array[array.length -1];

            return newArray;
    }
}
