package structural.bridge2;

import structural.bridge2.audiodevice.Headphones;
import structural.bridge2.device.ComputerHF;
import structural.bridge2.device.Telephone;
import structural.bridge2.musicplayer.Fizy;
import structural.bridge2.musicplayer.Spotify;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Sezen Aksu", "Gülümse");

        ComputerHF computerHF = new ComputerHF();
        computerHF.musicPlay(music);

        System.out.println("*******************");

        Telephone telephone = new Telephone(new Headphones(), new Fizy());
        telephone.musicPlay(music);

        System.out.println("********************");

        Telephone telephone1 = new Telephone(new Headphones(), new Spotify());
        telephone1.musicPlay(music);
    }
}
