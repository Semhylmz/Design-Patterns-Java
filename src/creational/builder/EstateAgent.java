package creational.builder;

public class EstateAgent {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.setCity("İstanbul");
        home1.setCounty("Nişantaşı");
        home1.setDistrict("Nişantaşı 1");
        home1.setRoomNumber(5);
        home1.setBuildingAge(2022);
        home1.setAirConditioning(true);

        Home home2 = new Home("İstanbul", "Ümraniye", "Tatlısu", 2008, 2,
                3, 2, 0, false, false, true, true,
                true, false);

        printHome(home1);
        printHome(home2);
    }

    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Home added! -> " + home);
    }
}
