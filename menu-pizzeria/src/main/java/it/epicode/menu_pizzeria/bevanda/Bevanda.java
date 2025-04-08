package it.epicode.menu_pizzeria.bevanda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda {

    private String name;
    private String description;
    private double price;
    private double calories;
}
