package main.fullproject;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1","Pippi långstrump", "Astrid lindgren", 1945));
        library.addBook(new Book("2","Pippi långstrump", "Astrid lindgren", 1945));
        library.addBook(new Book("3","Sagan om ringen", "Tolkien", 1954));
        library.addBook(new Book("4","Emil i lönneberga", "Astrid lindgren", 1964));
        library.addBook(new Book("5","ABC", "Astrid lindgren", 1964));


        System.out.println("Våra böcker inna alla lån");

        for (Book book: library.getSortedBooks()){
            System.out.println(book);
        }

        System.out.println("Lån lyckades " + library.borrow("1", "Yahya"));

        System.out.println("Lån lyckades " + library.borrow("1", "Hadir"));

        System.out.println("Lån lyckades " + library.borrow("2", "Emily"));



        System.out.println("Alla lånetagare i vårt system " +library.getBorrowers());

        System.out.println("Våra böcker efter alla lån");


        for (Book book: library.getSortedBooks()){
            System.out.println(book);
        }






    }
}

        /*
            TODO
            1.Klasser DONE
            2.TDD DONE
            3.ENUM DONE
            4.objektsamverkan DONE
            5.Collections
         */


