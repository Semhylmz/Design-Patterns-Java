package creational.factory;

public class TelephoneFactory {
    public static Telephone getTelephone(String model, String battery, int width, int height) {
        Telephone telephone;
        if ("xtelephone".equalsIgnoreCase(model)) {
            telephone = new XTelephone(model, battery, width, height);

        } else if ("ytelephone".equalsIgnoreCase(model)) {
            telephone = new YTelephone(model, battery, width, height);
        } else {
            throw new RuntimeException("Model is no definied!");
        }
        return telephone;
    }
}
