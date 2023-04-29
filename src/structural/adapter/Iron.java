package structural.adapter;

public class Iron implements ElectricalAppliances {

    private int voltage;

    public Iron() {
        this.voltage = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Iron running...");
        return this.voltage;
    }
}
