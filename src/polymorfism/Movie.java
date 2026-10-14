package polymorfism;

public class Movie extends Media {

    private int runtime;

    public Movie(String title, int runtime){
        super(title);
        this.runtime = runtime;
    }



    @Override
    public int loanDays(){
        return 7;
    }

    public void playMovie() {
        System.out.println("Playing: " + title);
    }




}
