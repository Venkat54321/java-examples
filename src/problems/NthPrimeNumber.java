package problems;

public class NthPrimeNumber {

    public static void main(String[] args) {

        for (int j = 2; j <= 100; j++) {

            for (int i = 2; i <= j/2; i++) {
                if (j % i != 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
