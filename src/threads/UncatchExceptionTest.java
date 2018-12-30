package threads;

public class UncatchExceptionTest {

    public static void main(String[] args) {
          MyWorkerThread myWorkerThread = new MyWorkerThread();
        myWorkerThread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t.getName()+": "+e);
                        MyWorkerThread worker = new MyWorkerThread();
                        worker.start();
                    }
                });

          myWorkerThread.start();


    }
}
