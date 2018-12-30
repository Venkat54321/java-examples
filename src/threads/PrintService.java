package threads;

public class PrintService {


    public static void print(int i) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() +"  e"+ i);
    }
}
