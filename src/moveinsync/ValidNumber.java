package moveinsync;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(5);

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter number for validation :");
        int value = sca.nextInt();
        for (int i = 2; i < 100; i++) {
            if (value % i == 0 && i != value) {
                list.add(i);
            }
        }

        boolean check = true;

        for(int i =0;i<list.size();i++){
            if(!list2.contains(list.get(i))){
                check = false;
            }
        }

            if (check) {
                System.out.println("valid number");
            } else {
                System.out.println("Not valid number");
            }

        }
}
