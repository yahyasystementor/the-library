package main.fullproject;

public class Book implements Comparable<Book> {

    // varje bok ska ha en unik ID

    private String id;

    private String title;
    private String author;
    private int year;
    private Status status;

    private int createdBooks;




    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = Status.AVAILABLE;
        createdBooks++;
    }

    public int getCreatedBooks() {
        return createdBooks;
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
        return status == Status.AVAILABLE;
    }

    public int getYear() {
        return year;
    }

    public boolean borrow(){
        if (status != Status.AVAILABLE){
            return false;
        }

        status = Status.BORROWED;
        return true;
    }

    public boolean returnItem(){
        if (status != Status.BORROWED){
            return false;
        }
        status = Status.AVAILABLE;
        return true;
    }




    @Override
    public String toString(){
        return id + " | " + title + " | " + author +" | " + status;
    }

    @Override
    public int compareTo(Book other){
        return getTitle().compareToIgnoreCase(other.getTitle());
    }

}
