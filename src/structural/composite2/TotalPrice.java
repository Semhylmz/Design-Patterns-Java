package structural.composite2;

import java.math.BigDecimal;
import java.util.List;

public class TotalPrice {
    public static BigDecimal totalPrice(List<Product> productList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    public static BigDecimal totalPacketPrice(List<Packet> packetList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Packet packet : packetList) {
            totalPrice = totalPrice.add(packet.getPrice());
        }
        return totalPrice;
    }
}
