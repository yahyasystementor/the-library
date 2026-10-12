package arv;

public class TimeMedia extends Media {

    private int duration;

    public TimeMedia(int year, String title, String creator, int duration) {
        super(year, title, creator);
        this.duration = duration;
    }

}


