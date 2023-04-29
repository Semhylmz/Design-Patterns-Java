package creational.abstractFactory;

public class XModelTelephoneFactory implements TelephoneFactory {
    @Override
    public Telephone getTelephone(String model, String battery, int width, int height) {
        return new XModelTelephone(model, battery, width, height);
    }
}
