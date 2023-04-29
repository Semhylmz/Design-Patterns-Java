package structural.bridge2.audiodevice;

public class Headphones implements AudioDevice {
    @Override
    public void audioPlay(String audio) {
        System.out.println("Headphones audio running.. " + audio);
    }
}
