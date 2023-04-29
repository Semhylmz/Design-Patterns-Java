package creational.factory;

public class XTelephone implements Telephone {
    private String model;
    private String battery;
    private int width;
    private int height;

    public XTelephone(String model, String battery, int width, int height) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBattery() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String toString() {
        return "XTelephone{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
