package main.fullproject;

import java.util.*;
import java.util.logging.Logger;

public class Library {


    private static final Logger log = Logger.getLogger(Library.class.getName());

    private List<Book> books = new ArrayList<>();
    private Map<String, Book> booksById = new HashMap<>();
    private List<Loan> loanHistory = new ArrayList<>();



    public boolean addMedia(Book book){
        if (booksById.containsKey(book.getId())){
            return false;
        }
        books.add(book);
        booksById.put(book.getId(), book);
        return true;
    }

    public Book getById(String id){
        return booksById.get(id);
    }

    public List<Book> getSortedMedia(){
        List<Book> result = new ArrayList<>(books);
        Collections.sort(result);
        return result;
    }

    public boolean borrow(String id, String borrower){

        Book book = getById(id);

        if (book == null){
            return false;
        }

        if (!book.borrow()){
            return false;
        }

         Loan loan = new Loan(book, borrower);
         log.info(borrower + " borrowed loan " + loan);
         loanHistory.add(loan);
        return true;
    }


    public boolean returnItem(String id){

        Book book = getById(id);

        if (book == null){
            return false;
        }


        log.info("Återlämnad " + book.getTitle());
        return book.returnItem();

    }

    public List<Loan> getHistory(){
        return new ArrayList<>(loanHistory);
    }


    public Set<String> getBorrowers(){

        Set<String> names = new HashSet<>();

        for (Loan loan: loanHistory){
            names.add(loan.getBorrower());
        }
        return names;
    }






}
