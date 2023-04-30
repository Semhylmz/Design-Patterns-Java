package behavior.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        CargoCompany cargoCompany = SbmCargo.getCargoCompany();
        cargoCompany.shipIt(EnumCity.KARS);
        System.out.println("\n-----------------\n");
        cargoCompany.shipIt(EnumCity.ANTALYA);
        System.out.println("\n-----------------\n");
        cargoCompany.shipIt(EnumCity.ISTANBUL);
        System.out.println("\n-----------------\n");
        cargoCompany.shipIt(EnumCity.KARS);
        System.out.println("\n-----------------\n");
    }
}
