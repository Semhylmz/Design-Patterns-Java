package creational.abstractFactory;

public class AbstractTelephoneSeller {
    public static void main(String[] args) {
        XModelTelephoneFactory xModelTelephoneFactory = new XModelTelephoneFactory();
        Telephone xModel = xModelTelephoneFactory.getTelephone("X model", "3800", 4, 7);

        YModelTelephoneFactory yModelTelephoneFactory = new YModelTelephoneFactory();
        Telephone yModel = yModelTelephoneFactory.getTelephone("Y model", "3000", 5, 8);

        System.out.println(xModel);
        System.out.println(yModel);
    }
}
