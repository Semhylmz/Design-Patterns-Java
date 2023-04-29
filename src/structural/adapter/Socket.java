package structural.adapter;

public class Socket {
    public void giveElectric(ElectricalAppliances electricalAppliances) {
        int voltage = electricalAppliances.plugAndPlay();
        System.out.println("Voltage: " + voltage);
    }
}
