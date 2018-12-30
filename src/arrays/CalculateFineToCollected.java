package arrays;

public class CalculateFineToCollected {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int date = 16;
        int fine = 0;
        boolean isOdd;

        if(date % 2 == 0){
            isOdd = false;
        }else {
            isOdd = true;
        }

        for(int i =0;i<array.length;i++){

            if(isOdd && array[i]%2 !=0){

                fine = fine + 250;

            }else if(!isOdd && array[i]%2 ==0) {

                fine = fine + 250;
            }
        }

        System.out.println(fine);
    }
}
