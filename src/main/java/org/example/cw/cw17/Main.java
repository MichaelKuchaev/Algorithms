package org.example.cw.cw17;

public class Main {
    public static void main(String[] args) {
        Book book = BookBuilder.getInstance().setName("Война и Мир").setFirstNameAuthor("Лев").setLastNameAuthor("Толстой").setYear(1873).setNumberOfPages(1300).build();
        Book book1 = BookBuilder.getInstance().setName("Идиот").setFirstNameAuthor("Федор").setLastNameAuthor("Достоевский").setYear(1868).setNumberOfPages(700).setGenre("роман").build();
        Book book2 = BookBuilder.getInstance().setName("Евгений Онегин").setFirstNameAuthor("Александр").setLastNameAuthor("Пушкин").setYear(1833).setNumberOfPages(230).setGenre("роман в стихах").build();
        System.out.println(book.toString());
        System.out.println();
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();
        Magazine magazine = MagazineBuilder.getInstance().setName("Плэйбой").setGenry("эротика").setPublishingHouse("Playboy Enterprises").setYear(1953).build();
        Magazine magazine1 = MagazineBuilder.getInstance().setName("Форбс").setGenry("финансы").setPublishingHouse("The Forbes").setYear(1917).setRating(5).build();
        Magazine magazine2 = MagazineBuilder.getInstance().setName("Вокруг света").setGenry("путешествия").setPublishingHouse("Молодая гвардия").setYear(1861).setNumberOfPages(150).build();
        System.out.println(magazine.toString());
        System.out.println();
        System.out.println(magazine1.toString());
        System.out.println();
        System.out.println(magazine2.toString());
    }
}
