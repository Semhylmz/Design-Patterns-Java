package structural.bridge1;

import structural.bridge2.Music;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Sezen Aksu", "Gülümse");
        Computer computer = new Computer();
        computer.musicPlay(music);
    }
}
