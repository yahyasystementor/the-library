package arv;

public class Movie extends TimeMedia {

    public Movie(int year, String title, String creator, int duration) {
        super(year, title, creator, duration);
    }

    @Override
    public int loanDays() {

        int bas = super.loanDays();
        return 7 + bas;
    }

}
