package javatest;

import java.util.HashMap;
import java.util.Map;

public class MapSortTest {

    public static void main(String[] args) {
        Map<String, Integer> budget = new HashMap<>();

        budget.put("clothes", 120); budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130); budget.put("rent", 1150);
        budget.put("miscellneous", 90);

        System.out.println(budget);

    }
}
