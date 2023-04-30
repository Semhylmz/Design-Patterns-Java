package structural.composite2;

import java.math.BigDecimal;

public class App2 {
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

        Stores stores = new Stores("Ramadan stores");
        Product oil = new Product("Oil", BigDecimal.valueOf(50));
        stores.getPacketList().add(vegetablePacket);
        stores.getProductList().add(oil);

        Cart cart = new Cart("My Cart");
        cart.getPriceList().add(vegetablePacket);
        cart.getPriceList().add(technologyPacket);
        cart.getPriceList().add(ball);
        cart.getPriceList().add(stores);

        BigDecimal totalPrice = cart.totalPrice();
        System.out.println("Total price: " + totalPrice + "TL ");
    }
}
