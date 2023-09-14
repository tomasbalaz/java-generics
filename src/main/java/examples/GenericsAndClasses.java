package examples;

import java.util.Date;

public class GenericsAndClasses {
    public static void main(String[] args) {
//        Box2 box = new Box2<>();
//        box.setT("1");
//        box.setT(1);
//        box.setT(new Date());

        Box2<Phone2> phones = new Box2<>();
        phones.setT(new Phone2("Samsung"));
        System.out.println(phones.getT());

        Box2<Letter2> letters = new Box2<>();
        letters.setT(new Letter2("Tomas"));
        System.out.println(letters.getT());

    }
}
