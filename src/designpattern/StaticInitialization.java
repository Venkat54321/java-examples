package designpattern;

public class StaticInitialization {

    private static StaticInitialization instance;

    private StaticInitialization(){
    }

    static {
        try{
            instance = new StaticInitialization();
        }catch (Exception e){

        }
    }

    public static StaticInitialization getInstance(){
        return instance;
    }

}
