package polymorfism;



public class Main {
    public static void main(String[] args) {


        // ALLA KLASSER SOM ANVÄNDER SIG AV BOOK MÅSTE HA loan();

        Movie movie = new Movie("titanic", 3);
        System.out.println(movie.loanDays());

    }
}
