package polymorfism;

public abstract class  Media {

    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public abstract int loanDays();
    public void printInfo(){
        System.out.println(title);
    }

}
