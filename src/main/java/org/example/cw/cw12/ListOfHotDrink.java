package org.example.cw.cw12;

import java.util.Iterator;
import java.util.List;

public class ListOfHotDrink implements Iterable<HotDrink> {
    List<HotDrink> hotDrinkList;
    private int countHD;

    public void setListHD(List<HotDrink> listHD) {
        this.hotDrinkList = listHD;
    }
    public List<HotDrink> getListHD() {
        return hotDrinkList;
    }

    @Override
    public Iterator<HotDrink> iterator() {
        return hotDrinkList.iterator();
    }
}
