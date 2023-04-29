package structural.bridge2.musicplayer;

import structural.bridge2.Music;

public class Spotify implements MusicPlayer {
    @Override
    public String musicPlay(Music music) {
        System.out.println("Spotify " + music + " playing.");
        return music.getVoice();
    }
}
