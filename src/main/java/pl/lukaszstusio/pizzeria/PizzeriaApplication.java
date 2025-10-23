package pl.lukaszstusio.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);

		Pizza margarita = new Pizza("Margarita", 15, false, null);
		String nameofpizza = margarita.getName();
		System.out.println(margarita);

		Ingredient tomato = new Ingredient("Tomato", 2, true, 1, false);
		System.out.println(tomato);

        Beverage soczek = new Beverage("Kubuś", 5, true);
//        System.out.println(soczek.toString());
        System.out.println(soczek);

        Order order1 = new Order(01);
//        order1.addProducts(new Product[] { margarita, soczek});
        order1.addProducts(List.of(margarita, soczek));

        System.out.println(order1);
	}

}

