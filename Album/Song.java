package Album;

public class Song {
    int id;
    String title, genre, artist;
    double duration;

    Song(int id, String title, String genre, double duration, String artist) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
