package pl.lukaszstusio.pizzeria.pizza;

public class NullPizzaIngredientsException extends RuntimeException {
    public NullPizzaIngredientsException(String message) {
        super(message);
    }
}
