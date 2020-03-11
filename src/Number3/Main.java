package Number3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> people = new MyArrayList<>();
        people.add("Tanya");
        people.add("Petro");
        people.add("Kate");
        people.add("Semen");
        System.out.println("до видалення");
        people.print();
        people.remove(1);
        System.out.println("після видалення");
        people.print();

    }
}
