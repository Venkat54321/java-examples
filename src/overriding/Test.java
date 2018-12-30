package overriding;



class Company {
    protected Object address() throws Exception {
        System.out.println("Company Address method");
        return "";
    }
}

class Example extends Company{

}

class Appnomic extends Example{

    protected Example address() throws Exception{
        System.out.println("Appnomic Address");
        super.address();
        return new Example();
    }
}

public class Test {

    public static void main(String[] ars) throws Exception{

        Company c =new Company();
        Appnomic a = new Appnomic();
        c.address();
        a.address();
    }
}
