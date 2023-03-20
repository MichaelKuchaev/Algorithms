package org.example.cw.cw14.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.example.cw.cw14.model.Cat;
import org.example.cw.cw14.model.Dog;

public class AnimalView {
    public static void CatPrint(){
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

    public static void DogPrint(){
        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog("pirate", 15, "black"));
        listOfDogs.add(new Dog("sharick", 6, "white"));
        listOfDogs.add(new Dog("buket", 9, "brown"));
        listOfDogs.add(new Dog("rocky", 2, "gray"));
        listOfDogs.add(new Dog("arka", 20, "gray"));
        Collections.sort(listOfDogs);
        for (Dog dog : listOfDogs) {
            System.out.println(dog.getName() + " | " + dog.getAge() + " | " + dog.getColor());
        }
    }
}
