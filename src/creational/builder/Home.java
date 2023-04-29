package creational.builder;

public class Home {
    private String city, county, district;

    private int buildingAge, balconyNumber, roomNumber, bathNumber, toiletNumber;

    private boolean isDuplex, isFurnished, isCarPark, isChildPark, isAirConditioning, isPool;

    public Home() {
    }

    public Home(String city, String county, String district, int buildingAge, int balconyNumber, int roomNumber,
                int bathNumber, int toiletNumber, boolean isDuplex, boolean isFurnished, boolean isCarPark,
                boolean isChildPark, boolean isAirConditioning, boolean isPool) {
        this.city = city;
        this.county = county;
        this.district = district;
        this.buildingAge = buildingAge;
        this.balconyNumber = balconyNumber;
        this.roomNumber = roomNumber;
        this.bathNumber = bathNumber;
        this.toiletNumber = toiletNumber;
        this.isDuplex = isDuplex;
        this.isFurnished = isFurnished;
        this.isCarPark = isCarPark;
        this.isChildPark = isChildPark;
        this.isAirConditioning = isAirConditioning;
        this.isPool = isPool;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getBuildingAge() {
        return buildingAge;
    }

    public void setBuildingAge(int buildingAge) {
        this.buildingAge = buildingAge;
    }

    public int getBalconyNumber() {
        return balconyNumber;
    }

    public void setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBathNumber() {
        return bathNumber;
    }

    public void setBathNumber(int bathNumber) {
        this.bathNumber = bathNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isCarPark() {
        return isCarPark;
    }

    public void setCarPark(boolean carPark) {
        isCarPark = carPark;
    }

    public boolean isChildPark() {
        return isChildPark;
    }

    public void setChildPark(boolean childPark) {
        isChildPark = childPark;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean pool) {
        isPool = pool;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", district='" + district + '\'' +
                ", buildingAge=" + buildingAge +
                ", balconyNumber=" + balconyNumber +
                ", roomNumber=" + roomNumber +
                ", bathNumber=" + bathNumber +
                ", toiletNumber=" + toiletNumber +
                ", isDuplex=" + isDuplex +
                ", isFurnished=" + isFurnished +
                ", isCarPark=" + isCarPark +
                ", isChildPark=" + isChildPark +
                ", isAirConditioning=" + isAirConditioning +
                ", isPool=" + isPool +
                '}';
    }
}

