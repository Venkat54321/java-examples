package overriding;

class ClassX{

    void calculate(int a,int b){
        System.out.println("Class X");
    }
}
class ClassY extends ClassX{
    void calculate(int a,int b){
        System.out.println("Class Y");
    }
}
class ClassZ extends ClassY{
    void calculate(int a,int b){
        System.out.println("Class Z");
    }
}

public class MainOverride {
    public static void main(String[] args) {
        ClassX x = new ClassY();
        x.calculate(2,3);
        ClassY Z = (ClassZ)x;
        Z.calculate(2,3);
    }
}
