package structural.adapter;

public class Test {
    public static void main(String[] args) {
        Socket socket = new Socket();

        Iron iron = new Iron();
        Fridge fridge = new Fridge();

        socket.giveElectric(iron);
        socket.giveElectric(fridge);

        XTelephone xTelephone = new XTelephone();
        TelephoneElectricalAppliancesAdapter adapter = new TelephoneElectricalAppliancesAdapter(xTelephone);
        socket.giveElectric(adapter);
    }
}
