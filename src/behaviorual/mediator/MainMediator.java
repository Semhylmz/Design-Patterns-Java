package behaviorual.mediator;

public interface Mediator {
    void addManufacturer(Manufacturer manufacturer);

    void addWholesaler(Wholesaler wholesaler);

    void buyManufacturer(Manufacturer manufacturer);

    void sellWholesaler(Wholesaler wholesaler);


}
