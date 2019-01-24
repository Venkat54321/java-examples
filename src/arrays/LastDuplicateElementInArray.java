package arrays;

public class LastDuplicateElementInArray {

    public static void main(String[] args) {
        int[] array =  {0, 1, 2, 2, 4, 5, 5, 5, 8};
        int j = array.length -1;
        while (true){
            if(array[j] == array[j--]){
                System.out.println(array[j] +"is duplicated");
                return;
            }else{
                j--;
            }
        }
    }
}
