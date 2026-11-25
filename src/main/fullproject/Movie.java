package main.fullproject;

public class Movie extends Medium {

    private String director;
    private int durationMinutes;


    public Movie(String id, String title, int year, String director, int durationMinutes) {
        super(id, title, year);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }



    @Override
    public int loanDays(){
        return 7;
    }


    @Override
    public String toString() {
        return getId() + " | " + getTitle() + " | " + director + " | " + durationMinutes + " minutes " + getStatus();
    }
}
