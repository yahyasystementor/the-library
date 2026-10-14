package polymorfism;



// at the moment its implementing two interfaces, use with causation
public class Book extends Media implements Borrowable, Test {

    private int pages;
    private boolean borrowed;


    public Book(String title) {
        super(title);
    }

    @Override
    public int loanDays(){
        return 28;
    }

    @Override
    public void borrow() {
        borrowed = true;
    }


    @Override
    public void returnItem (){
        borrowed = false;
    }

    @Override
    public boolean isAvailable(){
        return !borrowed;
    }

}
