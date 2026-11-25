package main.fullproject;

public class Utility {
    public static void showCatalog(Library library){
        for (Medium medium: library.getSortedMedia()){
            System.out.println(medium);
        }
    }


    public static void showDialog(Library library){

        System.out.println("Lån lyckades " + library.borrow("1", "Yahya"));
        System.out.println("Lån lyckades " + library.borrow("1", "Hadir"));
        System.out.println("Lån lyckades " + library.borrow("2", "Emily"));


        System.out.println("Alla lånetagare i vårt system " +library.getBorrowers());

        System.out.println("Våra böcker efter alla lån");
    }

}
