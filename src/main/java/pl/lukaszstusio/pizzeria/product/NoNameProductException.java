package pl.lukaszstusio.pizzeria.product;

public class NoNameProductException extends RuntimeException {
    public NoNameProductException(String message) {
        super(message);
    }
}
