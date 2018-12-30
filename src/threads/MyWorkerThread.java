package threads;

public class MyWorkerThread extends Thread {

    static int count = 0;

   /* public MyWorkerThread(){
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                MyWorkerThread myWorkerThread  = new MyWorkerThread();
                myWorkerThread.start();
            }
        });
    }*/

    @Override
    public void run() {
        while ( true ) {
            try {
                // Do this work every second forever unless interuppted
                doWork();
                Thread.sleep(1000);
            }
            catch ( InterruptedException e ) {
                return;
            }
        }
    }

    private void doWork() {
        // Simulate work that sometimes results in NullPointerException
        StringBuffer sb = new StringBuffer("My Work counter: ");
        if ( count++ >= 5 ) {
            sb = null; //oops!
            count = 0;
        }
        sb.append(count);
        System.out.println(sb.toString());
    }
}
