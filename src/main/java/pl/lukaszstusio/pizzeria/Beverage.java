package pl.lukaszstusio.pizzeria;


import pl.lukaszstusio.pizzeria.product.Product;

public class Beverage extends Product {
    public Beverage (String name, int price, boolean vegan) {
        super(name, price, vegan);
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                '}';
    }
}

