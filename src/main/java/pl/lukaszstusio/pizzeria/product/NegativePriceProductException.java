package pl.lukaszstusio.pizzeria.product;

public class NegativePriceProductException extends RuntimeException {
    public NegativePriceProductException(String message) {
        super(message);
    }
}
