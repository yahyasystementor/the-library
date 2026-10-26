package main.arv;

public class Book extends Media {

    private int pages;

    public Book(String title, int year, int pages, String creator) {
        super(year,title,creator);
        this.pages = pages;
    }

    public Book(int year, String title, String creator) {
        super(year, title, creator);
    }



}
