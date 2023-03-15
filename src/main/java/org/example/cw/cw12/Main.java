package org.example.cw.cw12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfColdDrink listOfCD = new ListOfColdDrink();
        listOfCD.setListCD(Arrays.asList(
                new ColdDrink("Pepsi", 12, 330),
                new ColdDrink("Sprite", 15, 330),
                new ColdDrink("Cola", 27, 330)));
        ListOfHotDrink listOfHD = new ListOfHotDrink();
        listOfHD.setListHD(Arrays.asList(
                new HotDrink("Tea", 84),
                new HotDrink("Latte", 82),
                new HotDrink("Capuchino", 92)));

        System.out.println("\n--------Сортировка через класс Comparable Of Cold Drink по названию--------");
        listOfCD.getListCD().sort(new ComparableOfDrink<>());
        for (ColdDrink coldDrink : listOfCD) {
            System.out.println(coldDrink);
        }
        System.out.println("\n--------Сортировка через класс Comparable Of Hot Drink по названию--------");
        listOfHD.getListHD().sort(new ComparableOfDrink<>());
        for (HotDrink hotDrink : listOfHD) {
            System.out.println(hotDrink);
        }
    }
}
