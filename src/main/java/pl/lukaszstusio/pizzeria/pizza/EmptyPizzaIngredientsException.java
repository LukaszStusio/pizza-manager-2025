package pl.lukaszstusio.pizzeria.pizza;

public class EmptyPizzaIngredientsException extends RuntimeException {
    public EmptyPizzaIngredientsException(String message) {
        super(message);
    }
}
