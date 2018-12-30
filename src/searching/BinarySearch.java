package searching;

public class BinarySearch{
    public static void main(String[] args) {
        int[] array = {3,5,6,8,10,14,55,77,98,102,134,156,200,244,500};
        int i =0;
        int j = array.length-1;
        int searchNumber = 10;
        while(i <= j){
            int middle = (i+j)/2;
            if(array[middle] == searchNumber) {
                System.out.println("Found" + middle + "index");
            }if(array[middle] < searchNumber){
                i = middle  + 1;
            }else {
                j = middle -1;
            }
        }
    }
}
