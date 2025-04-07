package it.epicode.menu_pizzeria.toppings;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "toppings")
public class Topping {

    @Id
    private Long id;
    private String name;
    private double price;
    private double calories;
}
