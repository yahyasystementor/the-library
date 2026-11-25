package main.fullproject;

import static main.fullproject.Utility.showCatalog;
import static main.fullproject.Utility.showDialog;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addMedium(new Book("1","Pippi långstrump", "Astrid lindgren", 1945));
        library.addMedium(new Book("2","Pippi långstrump", "Astrid lindgren", 1945));
        library.addMedium(new Book("3","Sagan om ringen", "Tolkien", 1954));
        library.addMedium(new Book("4","Emil i lönneberga", "Astrid lindgren", 1964));
        library.addMedium(new Book("5","ABC", "Astrid lindgren", 1964));
	library.addMedium(new Movie("6","Avatar", 2009, "James Cameron", 300));


        System.out.println("Våra böcker inna alla lån");

        showCatalog(library);
        showDialog(library);
        showCatalog(library);

    }
}

        /*
            TODO
            1.Klasser DONE
            2.TDD DONE
            3.ENUM DONE
            4.objektsamverkan DONE
            5.Collections
            6.Arv interface
         */


