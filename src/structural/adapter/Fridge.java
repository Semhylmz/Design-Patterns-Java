package structural.adapter;

public class Fridge implements ElectricalAppliances {
    private int voltage;

    public Fridge() {
        this.voltage = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Fridge running...");
        return voltage;
    }

}
