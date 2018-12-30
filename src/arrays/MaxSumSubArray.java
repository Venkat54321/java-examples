package arrays;

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] array = {1,-3,2,-5,7,6,1,-4,11,-23};

        int ans =0;
        int sum =0;
        int start = 0;
        int end = 0;

        for(int i=0;i<array.length;i++){
              if(sum + array[i] > 0){
                sum = sum + array[i];
            }else{
                sum = 0;
            }
            ans = max(ans,sum);
        }

        System.out.println(ans);
        System.out.println(start);
        System.out.println(end);

    }

    public static int max(int ans,int sum){

        if(ans > sum)
            return ans;
        else return sum;
    }
}
