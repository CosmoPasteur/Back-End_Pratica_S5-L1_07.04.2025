package it.epicode.menu_pizzeria.pizza;

import it.epicode.menu_pizzeria.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {
    private final Topping mozzarella;
    private final Topping olive;
    private final Topping funghi;
    private final Topping peperoni;
    private final Topping pomodoro;

    @Bean
    private Pizza margherita() {
        return new Pizza("Margherita", "Pomodoro, Mozzarella, Basilico", 5.00, 400, List.of(pomodoro, mozzarella));
    }

    @Bean
    private Pizza peperoni() {
        return new Pizza("Peperoni", "Pomodoro, Mozzarella, Peperoni", 7.00, 500, List.of(pomodoro, mozzarella, peperoni));
    }

    @Bean
    private Pizza funghi() {
        return new Pizza("Funghi", "Pomodoro, Mozzarella, Funghi", 7.00, 500, List.of(pomodoro, mozzarella, funghi));
    }

    @Bean
    private Pizza olive() {
        return new Pizza("Olive", "Pomodoro, Mozzarella, Olive", 7.00, 500, List.of(pomodoro, mozzarella, olive));
    }
}
