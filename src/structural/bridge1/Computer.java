package structural.bridge1;

import structural.bridge2.Music;

public class Computer {
    private MusicPlayer musicPlayer;
    private Speaker speaker;

    public Computer() {
        musicPlayer = new MusicPlayer();
        speaker = new Speaker();
    }

    public void musicPlay(Music music) {
        System.out.println("Computer running..");

        String sound = musicPlayer.play(music);
        speaker.voicePlay(sound);
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
