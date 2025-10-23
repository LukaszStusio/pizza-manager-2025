package pl.lukaszstusio.pizzeria;



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

