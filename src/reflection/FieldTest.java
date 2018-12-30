package reflection;

public class FieldTest extends ParentFieldTest {

    private String pri;
    protected String pro;
    public String pub;

    public FieldTest() {
    }

    public FieldTest(String pri, String pro, String pub) {
        this.pri = pri;
        this.pro = pro;
        this.pub = pub;
    }

    public static void main(String[] args) {
        double d = 12.0;
        System.out.println(d);
    }

}
