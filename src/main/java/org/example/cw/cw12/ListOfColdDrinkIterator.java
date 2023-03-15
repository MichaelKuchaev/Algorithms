package org.example.cw.cw12;

import java.util.Iterator;
import java.util.List;

public class ListOfColdDrinkIterator implements Iterator<ColdDrink> {
    private List<ColdDrink> listOfColdDrinkIterable;
    private static int count;

    public ListOfColdDrinkIterator(List<ColdDrink> listOfColdDrinkIterable) {
        count = 0;
        this.listOfColdDrinkIterable = listOfColdDrinkIterable;

    }

    public static void setCount(int count) {
        ListOfColdDrinkIterator.count = count;
    }

    @Override
    public boolean hasNext() {
        return count < listOfColdDrinkIterable.size();
    }

    @Override
    public ColdDrink next() {
        return listOfColdDrinkIterable.get(count++);
    }
}
