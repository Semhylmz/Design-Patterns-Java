package creational.abstractFactory;

public class YModelTelephoneFactory implements TelephoneFactory {
    @Override
    public Telephone getTelephone(String model, String battery, int width, int height) {
        return new YModelTelephone(model, battery, width, height);
    }
}
