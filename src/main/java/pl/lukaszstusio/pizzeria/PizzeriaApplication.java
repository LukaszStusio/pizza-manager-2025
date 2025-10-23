package pl.lukaszstusio.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);

		Pizza margarita = new Pizza("Margarita", 15, false, null);
		String nameofpizza = margarita.getName();
		System.out.println(margarita);

		Ingredient tomato = new Ingredient("Tomato", 2, true, 1, false);
		System.out.println(tomato);

        Product soczek = new Beverage("Kubuś", 5, true);
//        System.out.println(soczek.toString());
        System.out.println(soczek);
	}

}
