package org.example.cw.cw14.controller;

import java.util.List;
import org.example.cw.cw14.model.Cat;

public class ListOfCats extends Cat {
    public static List<Cat> catList;



    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public void setListCat(List<Object> asList) {
    }

}
