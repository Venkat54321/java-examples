package string;

public class SplitExample {

    public static void main(String[] args) {
        String s = "work_manager_runtimes_0-1";
        int index = s.lastIndexOf('_');
        String subStr = s.substring(0,index);
        String prefixIndexNum = s.substring(index+1,s.length());
        System.out.println(subStr);
        System.out.println(prefixIndexNum);
    }
}
