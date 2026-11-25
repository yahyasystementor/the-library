package main.fullproject;

import java.time.LocalDate;
import java.util.UUID;

public class Loan {

    private Medium medium;
    private String borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;


    public Loan(Medium medium, String borrower) {
        this.medium = medium;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();

        this.dueDate = borrowDate.plusDays(medium.loanDays());
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
        return medium.getTitle() + " lånades av "  + borrower + " åter senast " + dueDate;

    }
}
