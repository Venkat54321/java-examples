package inheritance;


class Clidder{

    private final void find(){
        System.out.println("in Clidder");
    }
}


public class ClidderLet extends Clidder {

    public final void find(){
        System.out.println("In ClidderLet");
    }

    public static void main(String[] args) {
        new ClidderLet().find();
    }
}
