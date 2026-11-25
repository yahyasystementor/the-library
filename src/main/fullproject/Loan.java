package main.fullproject;

import java.time.LocalDate;
import java.util.UUID;

public class Loan {

    private Media media;
    private String borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;


    public Loan(Media media, String borrower) {
        this.media = media;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();

        this.dueDate = borrowDate.plusDays(media.loanDays());
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
        return media.getTitle() + " lånades av "  + borrower + " åter senast " + dueDate;

    }
}
