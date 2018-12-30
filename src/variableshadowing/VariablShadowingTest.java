package variableshadowing;

class SuperClass{
    protected String s = "Super Class";
}
class SubSuperClass extends SuperClass{
    protected String s = "Sub Super class";
}

public class VariablShadowingTest extends SubSuperClass {
    static String s = "local class";

    public void displayVal()
    {
        System.out.println("val = " + ((SuperClass)this).s);

        System.out.println("val = " + (super.s));
    }

    public static void main(String[] args) {



        VariablShadowingTest obj = new VariablShadowingTest();
        obj.displayVal();
    }

}
