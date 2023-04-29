package structural.bridge2.device;

import structural.bridge2.Music;
import structural.bridge2.audiodevice.AudioDevice;
import structural.bridge2.musicplayer.MusicPlayer;

public abstract class ComputerPlayMusic {
    protected AudioDevice audioDevice;
    protected MusicPlayer musicPlayer;

    public ComputerPlayMusic() {
    }

    public ComputerPlayMusic(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        this.audioDevice = audioDevice;
        this.musicPlayer = musicPlayer;
    }

    void musicPlay(Music music) {
        audioDevice.audioPlay(musicPlayer.musicPlay(music));
    }
}
