package org.example.cw.cw17;

public class MagazineBuilder {
    public static MagazineBuilder instance = null;
    Magazine obj;
    public MagazineBuilder(){

    }
    public static MagazineBuilder getInstance(){
        if (instance == null)
            instance = new MagazineBuilder();
        instance.obj = new Magazine();

        return instance;
    }
    public MagazineBuilder setName(String name){
        obj.setName(name);
        return this;
    }
    public MagazineBuilder setPublishingHouse(String publishingHouse){
        obj.setPublishingHouse(publishingHouse);
        return this;
    }
    public MagazineBuilder setYear(int year){
        obj.setYear(year);
        return this;
    }
    public MagazineBuilder setGenry(String genry){
        obj.setGenre(genry);
        return this;
    }
    public MagazineBuilder setNumberOfPages(int numberOfPages){
        obj.setNumberOfPages(numberOfPages);
        return this;
    }
    public MagazineBuilder setRating(int rating){
        obj.setRating(rating);
        return this;
    }
    public Magazine build(){
        return obj;
    }

    @Override
    public String toString() {
        return "MagazineBuilder{" +
                "obj=" + obj +
                '}';
    }
}
