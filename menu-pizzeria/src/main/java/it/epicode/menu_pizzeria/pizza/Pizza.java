package it.epicode.menu_pizzeria.pizza;

import it.epicode.menu_pizzeria.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    private String name;
    private String description;
    private double price;
    private int calories;
    private List<Topping> toppings = new ArrayList<>();

    public String toppingsToString() {
        String toppingsString = toppings.stream().map(Topping::getName).reduce("", (a, b) -> a + ", " + b);
    }

    public double getTotalPrice() {
        double totalPrice = price;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    public int getTotalCalories() {
        int totalCalories = calories;
        for (Topping topping : toppings) {
            totalCalories += topping.getCalories();
        }
        return totalCalories;
    }
}
