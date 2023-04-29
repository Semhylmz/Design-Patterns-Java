package structural.adapter;

public class XTelephone implements Telephone {
    private int voltage;

    public XTelephone() {
        this.voltage = 5;
    }

    @Override
    public int charge() {
        System.out.println("XTelephone charging running..");
        return voltage;
    }
}
