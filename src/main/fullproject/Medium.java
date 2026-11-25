package main.fullproject;

public abstract class Medium implements Borrowable, Comparable<Medium> {


    private String id;

    private String title;
    private int year;

    private Status status;


    public Medium(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.status = Status.AVAILABLE;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Status getStatus() {
        return status;
    }



    public abstract int loanDays();


    @Override
    public boolean isAvailable(){
        return status == Status.AVAILABLE;
    }

    @Override
    public boolean borrow(){
        if (!isAvailable()){
            return false;
        }
        status = Status.BORROWED;
        return true;
    }


    @Override
    public boolean returnItem(){

        if (status != Status.BORROWED){
            return false;
        }

        status = Status.AVAILABLE;
        return true;

    }


    @Override
    public int compareTo(Medium other){
        return title.compareToIgnoreCase(other.title);
    }

}
