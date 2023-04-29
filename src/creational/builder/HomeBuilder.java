package creational.builder;

public class HomeBuilder {
    private String city, county, district;

    private int buildingAge, balconyNumber, roomNumber, bathNumber, toiletNumber;

    private boolean isDuplex, isFurnished, isCarPark, isChildPark, isAirConditioning, isPool;

    public static HomeBuilder startBaseHomeBuild(String city, String county, String district, int buildingAge, int roomNumber) {
        HomeBuilder homeBuilder = new HomeBuilder();

        homeBuilder.city = city;
        homeBuilder.county = county;
        homeBuilder.district = district;
        homeBuilder.buildingAge = buildingAge;
        homeBuilder.roomNumber = roomNumber;

        return new HomeBuilder();
    }

    public Home build() {
        Home home = new Home();

        home.setCity(city);
        home.setCounty(county);
        home.setDistrict(district);

        home.setBuildingAge(buildingAge);
        home.setBalconyNumber(balconyNumber);
        home.setRoomNumber(roomNumber);
        home.setBathNumber(bathNumber);
        home.setToiletNumber(toiletNumber);

        home.setDuplex(isDuplex);
        home.setFurnished(isFurnished);
        home.setCarPark(isCarPark);
        home.setChildPark(isChildPark);
        home.setAirConditioning(isAirConditioning);
        home.setPool(isPool);

        return home;
    }

    /*public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setCounty(String county) {
        this.county = county;
        return this;
    }

    public HomeBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public HomeBuilder setBuildingAge(int buildingAge) {
        this.buildingAge = buildingAge;
        return this;

    public HomeBuilder setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }
    }*/

    public HomeBuilder setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
        return this;
    }

    public HomeBuilder setBathNumber(int bathNumber) {
        this.bathNumber = bathNumber;
        return this;
    }

    public HomeBuilder setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
        return this;
    }

    public HomeBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HomeBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HomeBuilder setCarPark(boolean carPark) {
        isCarPark = carPark;
        return this;
    }

    public HomeBuilder setChildPark(boolean childPark) {
        isChildPark = childPark;
        return this;
    }

    public HomeBuilder setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
        return this;
    }

    public HomeBuilder setPool(boolean pool) {
        isPool = pool;
        return this;
    }
}
