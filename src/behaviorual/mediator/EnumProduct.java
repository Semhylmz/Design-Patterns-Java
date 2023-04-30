package behaviorual.mediator;

public enum Product {
    TOMATO("Tomato"),
    CUCUMBER("Cucumber");

    private String name;

    Product(String name) {
        this.name = name;
    }

    public String getProduct() {
        return name;
    }
}
