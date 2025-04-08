package it.epicode.menu_pizzeria.menu;

import it.epicode.menu_pizzeria.bevanda.Bevanda;
import it.epicode.menu_pizzeria.pizza.Pizza;
import it.epicode.menu_pizzeria.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private String nome;
    private String descrizione;

    private List<Pizza> pizze = new ArrayList<>();
    private List<Bevanda> bevande = new ArrayList<>();;
    private List<Topping> toppings = new ArrayList<>();;

}
