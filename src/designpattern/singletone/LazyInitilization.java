package designpattern.singletone;

public class LazyInitilization {

    public static LazyInitilization instance;

    private LazyInitilization(){}

    public static LazyInitilization getInstance(){
        if(instance == null){
            instance = new LazyInitilization();
        }
        return instance;
    }
}
