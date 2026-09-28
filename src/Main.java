import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library("Systementors biblotek");

    public static void main(String[] args) {
        addStartBooks();

        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":  addBook(); break;
                case "2":  showAllBooks(); break;
                default:
                    System.out.println("Okänt val: "+ choice);
            }
        }
    }


    static void printMenu(){
        System.out.println("Systementors biblotek");
        System.out.println("1. Lägg till bok");

    }





    static void addBook() {
        System.out.println("Title: ");
        String title = scanner.nextLine();

        System.out.println("Author: ");
        String author = scanner.nextLine();

        System.out.println("Utgivningsår: ");
        String yearText = scanner.nextLine();
        int year = Integer.parseInt(yearText);
    }



    static void addStartBooks() {
        library.add(new Book("Pippi longstrump", "Astrid Lindgren", 1933));
        library.add(new Book("Ronja rövardotter", "Astrid Lindgren", 1960));

    }



}