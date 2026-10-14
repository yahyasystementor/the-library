package polymorfism;

public class Media {

    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public int loanDays() {
        return 28;
    }

    public void printInfo(){
        System.out.println(title);
    }

}
