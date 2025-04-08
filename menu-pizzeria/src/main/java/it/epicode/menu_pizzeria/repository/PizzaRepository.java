package it.epicode.menu_pizzeria.repository;

import it.epicode.menu_pizzeria.pizza.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
//public Pizza findByNameAndPriceAndCalories(String name, double price, double calories);

    //NOTA: PizzaRepository è un Bean
}
