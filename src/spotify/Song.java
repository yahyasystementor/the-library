package spotify;
public class Song {

    private String title;
    private String artist;
    private int seconds;

    public Song(String title, String artist, int seconds) {
        this.title = title;
        this.artist = artist;
        this.seconds = seconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (!(object instanceof Song)){
            return false;
        }
        Song song = (Song) object;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    public int hashCode() {
        return title.hashCode();
    }


    public String toString() {
        return title + " " + artist + " " + seconds + " " + "s";
    }

}
