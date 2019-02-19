package array.two.d;

public class Test {

    public static void main(String[] args) {
        int[][] array = {{1,2,0},{2,1,1},{1,2,3}};

        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println("\n");
        }
    }
}
