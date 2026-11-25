package main.fullproject;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        /*
            TODO
            1.Klasser DONE
            2.TDD DONE
            3.ENUM
            4.objektsamverkan
            5.Collections

         */


        Book book = new Book("1","Pippi långstrump", "Astrid lindgren", 1945);
        System.out.println(book);

        boolean success = book.borrow();

        if (success){
            Loan loan = new Loan(book, "Yahya");




            System.out.println(loan);
        }

        System.out.println(book);



    }
}
