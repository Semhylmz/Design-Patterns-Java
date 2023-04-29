package structural.composite2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String name;
    private List<Price> priceList;

    public Cart(String name) {
        this.name = name;
        this.priceList = new ArrayList<>();
    }

    public BigDecimal totalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Price price : priceList) {
            totalPrice = totalPrice.add(price.getPrice());
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }
}
