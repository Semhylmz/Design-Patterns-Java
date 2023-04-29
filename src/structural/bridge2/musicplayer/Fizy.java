package structural.bridge2.musicplayer;

import structural.bridge2.Music;

public class Fizy implements MusicPlayer {
    @Override
    public String musicPlay(Music music) {
        System.out.println("Fizy " + music + " playing.");
        return music.getVoice();
    }
}
