package arv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Book(1990, "Harry potter", "Yahya"));
        mediaList.add(new Movie(1978, "Pulp fiction", "Tarentino", 3));
        mediaList.add(new AudioBook(1978, "Pulp fiction", "Tarentino"));


        for (Media media : mediaList) {
            System.out.println(media.isAvailable());
            System.out.println(media.loanDays());
        }




    }


}
