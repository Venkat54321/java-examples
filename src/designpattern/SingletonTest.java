package designpattern;

class EagerInitialization {

    public static int count = 0;
    private static final EagerInitialization t = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return t;
    }

}

public  class SingletonTest{


    public static void main(String[] args) {

        int i=0;
        while(i < 10) {
            EagerInitialization.count++;
            i++;
        }

        System.out.println(EagerInitialization.count);
    }

}
