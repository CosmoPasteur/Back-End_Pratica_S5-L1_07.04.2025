package it.epicode.menu_pizzeria.menu;

import it.epicode.menu_pizzeria.bevanda.Bevanda;
import it.epicode.menu_pizzeria.pizza.Pizza;
import it.epicode.menu_pizzeria.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Topping mozzarella;
    private final Topping olive;
    private final Topping funghi;
    private final Topping peperoni;
    private final Topping pomodoro;

    private final Pizza margherita;
    private final Pizza pizzaPeperoni;
    private final Pizza pizzaFunghi;
    private final Pizza pizzaOlive;

    private final Bevanda cocaCola;
    private final Bevanda sprite;
    private final Bevanda fanta;

    public Menu menuPranzo() {

        return new Menu("Menu Pranzo",
                "Pizze e Bevande",
                List.of(margherita, pizzaPeperoni, pizzaFunghi, pizzaOlive),
                List.of(cocaCola, sprite, fanta),
                List.of(mozzarella, olive, funghi, peperoni, pomodoro));

    }
}
