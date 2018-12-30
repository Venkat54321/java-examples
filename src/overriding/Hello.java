package overriding;

class Z{
    public void showNumber(){
        System.out.println(10);
        return;
    }
}

public class Hello {


    public static void main(String[] args) {
        int[] array =  {10,2,3,};
        System.out.println(array.length);
    }
}
