package main.fullproject;

public class Book extends Medium {

    private String author;
    private int createdBooks;


    public Book(String id, String title,  String author,int year) {
        super(id, title, year);
        this.author = author;
        createdBooks++;
    }

    public int getCreatedBooks() {
        return createdBooks;
    }


    public String getAuthor() {
        return author;
    }


     @Override
     public int loanDays(){
        return 28;
     }

    @Override
    public String toString(){
        return getId() + " | " + getTitle() + " | " + getAuthor() +" | " + getStatus();
    }

}
