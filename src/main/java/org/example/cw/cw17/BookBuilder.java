package org.example.cw.cw17;

import org.example.cw.cw16.Dog;
import org.example.cw.cw16.DogBuilder;

public class BookBuilder {
    public static BookBuilder instance = null;
    Book obj;
    public BookBuilder(){

    }
    public static BookBuilder getInstance(){
        if (instance == null)
            instance = new BookBuilder();
        instance.obj = new Book();

        return instance;
    }
    public BookBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public BookBuilder setFirstNameAuthor(String firstNameAuthor){
        obj.setFirstNameAuthor(firstNameAuthor);
        return this;
    }
    public BookBuilder setLastNameAuthor(String lastNameAuthor){
        obj.setLastNameAuthor(lastNameAuthor);
        return this;
    }
    public BookBuilder setGenre(String genre){
        obj.setGenre(genre);
        return this;
    }
    public BookBuilder setYear(int year){
        obj.setYear(year);
        return this;
    }
    public BookBuilder setNumberOfPages(int numberOfPages){
        obj.setNumberOfPages(numberOfPages);
        return this;
    }
    public BookBuilder setRating(int rating){
        obj.setRating(rating);
        return this;
    }
    public Book build() {
        return obj;
    }

    @Override
    public String toString() {
        return "BookBuilder{" +
                "obj=" + obj +
                '}';
    }
}
