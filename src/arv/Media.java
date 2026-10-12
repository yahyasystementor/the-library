package arv;

public class Media {

    private String title;
    private int year;
    private boolean borrowed;
    private String creator;


    public Media(int year, String title, String creator) {
        this.year = year;
        this.title = title;
        this.creator = creator;
    }

    public void borrow(){
        borrowed = true;
    }

    public boolean isAvailable(){
        return  !borrowed;
    }


    public int loanDays() {
        return 28;
    }




}
