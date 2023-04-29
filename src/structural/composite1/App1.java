package structural.composite1;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {
        Product tomato = new Product("Tomato", BigDecimal.TEN);
        Product potato = new Product("Potato", BigDecimal.ONE);
        Product onion = new Product("Onion", BigDecimal.ONE);

        Packet vegetablePacket = new Packet("Vegetable packet");
        vegetablePacket.getProductList().add(tomato);
        vegetablePacket.getProductList().add(potato);
        vegetablePacket.getProductList().add(onion);

        Product soundSystem = new Product("Sound system", BigDecimal.valueOf(5000));
        Product headphones = new Product("Headphones", BigDecimal.valueOf(1000));

        Packet technologyPacket = new Packet("Technology packet");
        technologyPacket.getProductList().add(soundSystem);
        technologyPacket.getProductList().add(headphones);

        Product ball = new Product("Ball", BigDecimal.valueOf(100));

        Cart cart = new Cart("My Cart");
        cart.getPacketList().add(vegetablePacket);
        cart.getPacketList().add(technologyPacket);
        cart.getProductList().add(ball);

        BigDecimal totalPrice = cart.getTotalPrice();
        System.out.println("Total price: " + totalPrice + "TL");
    }
}
