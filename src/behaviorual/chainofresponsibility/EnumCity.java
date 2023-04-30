package behavior.chainofresponsibility;

public enum EnumCity {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars"),
    ;

    private String city;

    EnumCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
