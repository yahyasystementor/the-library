package main.fullproject;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private String borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;


    public Loan(Book book, String borrower, LocalDate borrowDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(28);
    }


    public String getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isOverDue(LocalDate today) {
        return today.isAfter(dueDate);
    }

    @Override
    public String toString() {
        return book.getTitle() + " lånades av "  + borrower + " åter senast " + dueDate;

    }
}
