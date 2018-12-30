package arrays;

public class MaximumDiffrence {

    public static void main(String[] args) {

        int arr[] = {1, 2, 90, 10, 110};
        maxDiff(arr,arr.length);

    }

   static void maxDiff(int arr[], int arr_size)
    {

        int max = arr[0];
        int min = arr[0];

        for(int i =0;i<arr_size;i++){

            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);
        System.out.println(max);
    }

}
