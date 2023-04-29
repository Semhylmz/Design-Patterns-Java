package structural.bridge2.device;

import structural.bridge2.Music;
import structural.bridge2.audiodevice.Headphones;
import structural.bridge2.musicplayer.Fizy;

public class ComputerHF extends ComputerPlayMusic {

    public ComputerHF() {
        audioDevice = new Headphones();
        musicPlayer = new Fizy();
    }

    @Override
    public void musicPlay(Music music) {
        System.out.println("Computer running..");
        super.musicPlay(music);
    }
}
