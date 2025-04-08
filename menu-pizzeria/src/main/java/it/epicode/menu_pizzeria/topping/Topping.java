package it.epicode.menu_pizzeria.topping;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {

    private String name;
    private String description;
    private double price;
    private int calories;
}
