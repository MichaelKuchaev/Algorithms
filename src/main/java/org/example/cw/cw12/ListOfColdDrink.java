package org.example.cw.cw12;

import java.util.Iterator;
import java.util.List;

public class ListOfColdDrink implements Iterable<ColdDrink> {
    private List<ColdDrink> coldDrinkList;

    public List<ColdDrink> getListCD() {
        return coldDrinkList;
    }
    public void setListCD(List<ColdDrink> listCD) {
        this.coldDrinkList = listCD;
    }


    @Override
    public Iterator<ColdDrink> iterator() {  return new ListOfColdDrinkIterator(coldDrinkList);
    }
}
