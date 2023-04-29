package creational.factory;

public class FactoryTelephoneSeller {
    public static void main(String[] args) {
        Telephone xModel = TelephoneFactory.getTelephone("xTelephone", "5000mAh", 4, 7);
        Telephone yModel = TelephoneFactory.getTelephone("YTelephone", "3000mAh", 5, 8);
        System.out.println("X modeli için telefon özellikleri: " + xModel);
        System.out.println("Y modeli için telefon özellikleri: " + yModel);
    }
}
