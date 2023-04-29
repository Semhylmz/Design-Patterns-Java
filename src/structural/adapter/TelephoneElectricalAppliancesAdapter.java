package structural.adapter;

public class TelephoneElectricalAppliancesAdapter implements ElectricalAppliances {

    private Telephone telephone;

    public TelephoneElectricalAppliancesAdapter(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public int plugAndPlay() {
        return telephone.charge();
    }
}
