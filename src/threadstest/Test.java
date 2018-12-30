package threadstest;

public class Test {

    private int count = 1;

    public void doSomething(){
        for (int i =0;i<10;i++){
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        Test demo = new Test();
        Thread a1 = new Example(demo);
        Thread a2 = new Example(demo);

        a1.start();
        a2.start();

    }
}

class Example extends Thread{

    Test demo;
    public Example(Test td){
        demo = td;
    }

    @Override
    public void run() {
        demo.doSomething();
    }
}
