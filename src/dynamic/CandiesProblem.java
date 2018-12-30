package dynamic;

public class CandiesProblem {

    public static void main(String[] args) {

        int[] rating = {3,1,2,1,4,5,6,4,9};
        int[] candies = new int[rating.length];

        //each one
        for(int i=0;i<rating.length;i++){
            candies[i] = 1;
        }

        for(int i=1;i<rating.length;i++){
            if(rating[i] > rating[i-1]){
                candies[i]=+candies[i-1];
            }
        }

        for(int i : candies){
            System.out.println(i);
        }

    }
}
