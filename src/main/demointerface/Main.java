package main.demointerface;

import main.polymorfism.Media;

public class Main {
    public static void main(String[] args) {


        Playable movie = new Movie();
        Playable music = new Music();

        Media media = new main.polymorfism.Movie("test", 3);


        movie.play();
        music.play();

    }
}
