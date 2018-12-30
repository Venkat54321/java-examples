package promtcloud;

public class BinaryCount {

    public static void main(String[] args) {

        Integer count  = getTheBinaryCount(100);

        System.out.println(count);
    }

    public static Integer getTheBinaryCount(Integer value){

        Integer count = 0;

        while(value > 0){
            value = value /2;
            count++;
        }

        return count;
    }
}
