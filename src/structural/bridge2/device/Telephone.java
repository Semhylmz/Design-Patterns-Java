package structural.bridge2.device;

import structural.bridge2.Music;
import structural.bridge2.audiodevice.AudioDevice;
import structural.bridge2.musicplayer.MusicPlayer;

public class Telephone extends ComputerPlayMusic {

    public Telephone(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        super(audioDevice, musicPlayer);
    }

    @Override
    public void musicPlay(Music music) {
        System.out.println("Telephone playing music.");
        super.musicPlay(music);
    }
}
