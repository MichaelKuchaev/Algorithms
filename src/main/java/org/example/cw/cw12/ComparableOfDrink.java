package org.example.cw.cw12;

import java.util.Comparator;

/**
 * Класс сортировки по имени собаки
 */
public class ComparableOfDrink<T extends Drink> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
