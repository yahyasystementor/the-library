package arv;

public class Main {
    public static void main(String[] args) {

        Media media = new Movie(1990, "Titanic", "Yahya", 3);
        Media media1 = new Book("Titanic", 1990, 2, "Yahya");



        System.out.println(media.loanDays());




    }
}
