package examples;

import java.util.HashMap;
import java.util.Objects;

public class Apple {

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");
        Apple a3 = new Apple("green");

        //hashMap stores apple type and its quantity
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 10);
        m.put(2, 20);
        m.put(1,30);
        System.out.println(m.get(1));
    }

}
