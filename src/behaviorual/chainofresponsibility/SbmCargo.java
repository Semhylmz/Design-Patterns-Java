package behavior.chainofresponsibility;

public class SbmCargo {
    public static CargoCompany getCargoCompany() {
        CankiriBranch cankiriBranch = new CankiriBranch();
        AnkaraBranch ankaraBranch = new AnkaraBranch();
        IstanbulBranch istanbulBranch = new IstanbulBranch();
        AntalyaBranch antalyaBranch = new AntalyaBranch();

        CargoCompany cargoCompany = cankiriBranch.setNextCargoCompany(ankaraBranch.setNextCargoCompany(istanbulBranch.setNextCargoCompany(antalyaBranch)));
        return cargoCompany;
    }
}
