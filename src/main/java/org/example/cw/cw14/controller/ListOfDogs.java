package org.example.cw.cw14.controller;

import org.example.cw.cw14.model.Dog;

import java.util.List;

public class ListOfDogs extends Dog {
    public List<Dog> dogList;

    public ListOfDogs(String name, int age, String color) {
        super(name, age, color);
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public void setListDog(List<Object> asList) {
    }
}
