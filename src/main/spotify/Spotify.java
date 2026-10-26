package main.spotify;

import java.util.*;

public class Spotify {
    public static void main(String[] args) {


        List<Song> byId = new ArrayList<>();



        byId.add(new Song("Dancing queen", "ABBA", 330));

        byId.add(new Song("Hey brother", "Avicii", 230));




    }
}




   /*




        System.out.println("slot 1: " + byId.get("slot1"));
        System.out.println("slot 1: " + byId.get("slot2"));
        System.out.println("Finns en nyckel för denna?: " + byId.get("slot9"));
        System.out.println("Finns slot 2 där inne någonstans?: " + byId.containsKey("slot2"));


        for (Map.Entry<String, Song> entry: byId.entrySet()) {
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }

        // Skapa en lista för våra låtar
        List<Song> playList = new ArrayList<>();


        // Lägger till låtar
        playList.add(new Song("Wake me up", "Avicii", 230));
        playList.add(new Song("Mammam Mia", "ABBA", 240));
        playList.add(new Song("Hey brother", "Avicii", 250));

        Song first = playList.get(0);

        System.out.println(playList.size());

        playList.remove(first);


        // Skapa en tom set för alla artister
        Set<String> artists = new HashSet<>();

        // Ta ut artistnamn från varje sång i en for each loop
        for (Song song : playList) {
            artists.add(song.getArtist());
        }


        System.out.println("Låtar: " + playList.size());
        System.out.println("Artister: " + artists.size());
        System.out.println(artists);

        Song kopia = new Song("Wake me up", "Avicii", 230);

        System.out.println("Finns kopia?: " + playList.contains(kopia));


         */


