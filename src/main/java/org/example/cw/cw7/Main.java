package org.example.cw.cw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat("barsik", 5));
        listOfCats.add(new Cat("murzik", 8));
        listOfCats.add(new Cat("bandit", 3));
        listOfCats.add(new Cat("pushistik", 1));

        Collections.sort(listOfCats);

        for (Cat cat : listOfCats) {
            System.out.println(cat.getName() + " | " + cat.getAge());
        }
    }
}
