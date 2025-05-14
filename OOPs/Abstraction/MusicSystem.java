public class MusicSystem {
    public static void main(String[] args) {
        Media m;
        m = new Music();
        accessMedia(m);
        Media.resetAll();
        m = new Video();
        accessMedia(m);
        Media.resetAll();

    }
    static void accessMedia(Media a) {
        a.play();
        a.stop();
        a.pause();
    }
}

interface Media {
    void play();
    void stop();
    default void pause() {
        System.out.println("Playback paused. Ready to resume....................................");
    }
    static void resetAll() {
        System.out.println("All media have been reset to it's default settings...........");
    }
}
class Music implements Media {
    @Override
    public void play() {
        System.out.println("Play the music.........");
    }
    @Override
    public void stop() {
        System.out.println("Stop the music.............");
    }
    @Override
    public void pause() {
        System.out.println("Music paused. Ready to resume........");
    }
}
class Video implements Media {
    @Override
    public void play() {
        System.out.println("Play the video.........");
    }
    @Override
    public void stop() {
        System.out.println("Stop the video.............");
    }
    @Override
    public void pause() {
        System.out.println("Video paused. Ready to resume........");
    }
}