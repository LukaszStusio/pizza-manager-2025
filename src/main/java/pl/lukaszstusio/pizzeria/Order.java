package pl.lukaszstusio.pizzeria;

import lombok.Getter;
import pl.lukaszstusio.pizzeria.product.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private int id;
    private List<Product> products = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }

    public void addProducts(Product[] products) {
        this.products = List.of(products);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}

