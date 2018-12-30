package threadstest;

public class AvailableProcesssor {

    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
