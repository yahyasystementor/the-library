package main.fullproject;

public class Main {
    public static void main(String[] args) {


        Book book = new Book("1","Pippi långstrump", "Astrid lindgren", 1945);


        System.out.println(book.getTitle());
        System.out.println("Ledig: " + book.isAvailabe());


    }
}
