package structural.composite1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String name;
    private List<Product> productList;
    private List<Packet> packetList;
    private List<Stores> storesList;

    public Cart(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packetList = new ArrayList<>();
        this.storesList = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }

        for (Packet packet : packetList) {
            List<Product> productList1 = packet.getProductList();
            for (Product product : productList1) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }

        for (Stores stores : storesList) {
            List<Product> productList1 = stores.getProductList();
            List<Packet> packetList1 = stores.getPacketList();

            for (Product product : productList1) {
                totalPrice = totalPrice.add(product.getPrice());
            }
            for (Packet packet : packetList1) {
                List<Product> productList2 = packet.getProductList();
                for (Product product : productList2) {
                    totalPrice = totalPrice.add(product.getPrice());
                }
            }
        }

        return totalPrice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Packet> getPacketList() {
        return packetList;
    }

    public void setPacketList(List<Packet> packetList) {
        this.packetList = packetList;
    }
}


