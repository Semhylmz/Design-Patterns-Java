package creational.builder;

public class EstateAgent2 {
    public static void main(String[] args) {
        Home home1 = HomeBuilder.startBaseHomeBuild("İstanbul", "Ümraniye", "tatlısu", 2008, 3)
                .setChildPark(true)
                .setCarPark(true)
                .build();

        printHome(home1);
    }

    private static void printHome(Home home) {
        System.out.println("Home added!\n" + home);
    }
}
