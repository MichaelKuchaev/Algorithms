package org.example.cw.cw17;

public class Book {
    String name;
    String firstNameAuthor;
    String lastNameAuthor;
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

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
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
        return "Book: " + name + '\n' +
                "firstNameAuthor: " + firstNameAuthor + '\n' +
                "lastNameAuthor: " + lastNameAuthor + '\n' +
                "year: " + year + '\n' +
                "genre: " + genre + '\n' +
                "numberOfPages: " + numberOfPages + '\n' +
                "rating: " + rating;
    }
}
