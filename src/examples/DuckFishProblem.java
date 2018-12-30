package examples;

public class DuckFishProblem {

    public static void main(String[] args) {

       // int[] a = {5,5,5,5,5};
       // int[] a = {5,4,3,0,1,3,2,2,3,1,5,2,5,5,5,5,3,1,1,1,0,4,5,0,5,2,3,4,2};
        //int[] b = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] a = {5,4,3,2,1};
        int[] b = {1,1,1,1,1};

        if(a[0] > a[1]){
            b[0] = 2;
        }else{
            b[0] = 1;
        }

        for(int i=1;i<a.length-2;i++){

            if(a[i] > a[i-1]){
                 b[i] = b[i-1] + 1;
            }else if(a[i] <= a[i+1]){
                b[i] = 1;
            }
        }


        if(a[a.length-2] > a[a.length-1])
        {
            b[a.length-2] = b[a.length - 2] + 1;
            b[a.length-1] = 1;
        }else{
            b[a.length-1] = b[a.length -1] + 1;
        }

        for(int i : b){
            System.out.println(i);
        }
    }
}
