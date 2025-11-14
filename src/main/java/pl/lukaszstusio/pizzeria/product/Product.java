package pl.lukaszstusio.pizzeria.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
public abstract class Product {
    protected String name;
    protected int price;
    protected boolean vegan;

    public Product(String name, int price, boolean vegan) {

        if (!StringUtils.hasText(name)) {
            throw new NoNameProductException("Every product must have a name");
        }

        if (price < 0) {
            throw new NegativePriceProductException("Price cannot be less than 0");
        }
        this.name = name;
        this.price = price;
        this.vegan = vegan;
    }

    public abstract String toString();
}
