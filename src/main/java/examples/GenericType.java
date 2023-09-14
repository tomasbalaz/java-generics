package examples;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {
    public static void main(String[] args) {

        // List<E> -> type parameter
        List<String> names // -> type argument
                = new ArrayList<String>();
        names.add("1");


        List<Integer> numbers
                = new ArrayList<>();
        numbers.add(1);

        Map<String, String> map
                = new HashMap<>();

        Map<Point, Double> map2
                = new HashMap<>();
    }
}
