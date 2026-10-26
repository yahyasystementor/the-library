package main.polymorfism;

public class LibraryLaptop implements Borrowable{

    private boolean checkedOut;


    @Override
    public void borrow() {
        checkedOut = true;
    }

    @Override
    public void returnItem (){
        checkedOut = false;
    }

    @Override
    public boolean isAvailable(){
        return !checkedOut;
    }

}
