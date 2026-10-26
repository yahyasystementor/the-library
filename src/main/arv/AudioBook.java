package main.arv;

public class AudioBook extends Media{

    public AudioBook(int year, String title, String creator) {
        super(year, title, creator);
    }


    @Override
    public int loanDays(){
        return 14;
    }

}

