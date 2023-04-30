package behavior.chainofresponsibility;

public abstract class CargoCompany {

    private EnumCity enumCity;
    private CargoCompany nextCargoCompany;

    public CargoCompany(EnumCity enumCity) {
        this.enumCity = enumCity;
    }

    public CargoCompany getNextCargoCompany() {
        return nextCargoCompany;
    }

    public CargoCompany setNextCargoCompany(CargoCompany nextCargoCompany) {
        this.nextCargoCompany = nextCargoCompany;
        return this;
    }

    public EnumCity getEnumCity() {
        return enumCity;
    }

    public void shipIt(EnumCity city) {
        incomingShippingInfo(city);

        if (getEnumCity().equals(city)) {
            deliveryCargoInfo();
        } else if (getNextCargoCompany() != null) {
            getNextCargoCompany().shipIt(city);
        } else {
            outsideTheServiceArea(city);
        }
    }

    private static void outsideTheServiceArea(EnumCity city) {
        System.out.println("Sorry, " + city.getCity() + " outside the service area.");
    }

    private void deliveryCargoInfo() {
        System.out.println(getEnumCity().getCity() + " branch received.");
    }

    private void incomingShippingInfo(EnumCity city) {
        System.out.println("Cargo to " + city.getCity() + " came to " + getEnumCity().getCity());
    }
}
