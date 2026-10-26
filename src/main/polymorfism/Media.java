package main.polymorfism;

public  class  Media {

    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public int loanDays() {
        return 7;
    }

    public void printInfo(){
        System.out.println(title);
    }

}
