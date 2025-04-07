package it.epicode.menu_pizzeria.drinks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Entity
@Data
public class Drink {
    private Long id;
    private String name;
    private double price;
    private double calories;
    private Temperatura temperatura;
}
