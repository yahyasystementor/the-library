package main.fullproject;

public class Book {

    // varje bok ska ha en unik ID
    private String id;


    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String id, String title, String author, int year, boolean borrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = borrowed;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailabe(){
        return !borrowed;
    }

    public int getYear() {
        return year;
    }
}
