package examples;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.ClassCastException
        List numbers = new ArrayList();
      //  numbers.add(1);
        numbers.add("2");

        for (Object number : numbers) {
            System.out.println((String) number);
        }
    }
}
