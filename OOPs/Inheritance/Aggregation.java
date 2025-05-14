public class Aggregation {
    public static void main(String[] args) {
       Song s = new Song();
       s.title = "Kolaveri di";
       s.artist = "Dhanush";
       Playlist p = new Playlist();
       p.track = s;
       p.addSong();

         System.out.println("Song title: " + p.track.title);
            System.out.println("Song artist: " + p.track.artist);
    }
}

class Song {
    String title;
    String artist;
}

class Playlist {
    Song track;

    void addSong() {
        System.out.println("Playing song: " + track.title + " by " + track.artist);
    }
}