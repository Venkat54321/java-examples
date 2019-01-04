package overriding;

class ClassAX{

    int m1(int i){
            return i*=i;
    }
}
class ClassAY extends ClassAX{

    double m1(double i){
        return i/=i;
    }
}
class ClassAZ extends ClassAY{

    float m1(float f){
        return f +=f;
    }
}


public class ClassDelegationTest {

    public static void main(String[] args) {
        ClassAZ z = new ClassAZ();
        System.out.println(z.m1(21.12));
    }
}
