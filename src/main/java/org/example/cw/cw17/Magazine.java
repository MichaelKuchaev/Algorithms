package org.example.cw.cw17;

public class Magazine {
    String name;
    String publishingHouse;
    int year;
    String genre;
    int numberOfPages;
    int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Magazine: " + name + '\n' +
                "publishingHouse: " + publishingHouse + '\n' +
                "year: " + year + '\n' +
                "genre: " + genre + '\n' +
                "numberOfPages: " + numberOfPages + '\n' +
                "rating: " + rating;
    }
}
