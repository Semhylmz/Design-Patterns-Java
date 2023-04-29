package structural.bridge1;

import structural.bridge2.Music;

public class MusicPlayer {
    public String play(Music music) {
        System.out.println("Music player: " + music + " sanatçısından");
        return music.getVoice();
    }
}
