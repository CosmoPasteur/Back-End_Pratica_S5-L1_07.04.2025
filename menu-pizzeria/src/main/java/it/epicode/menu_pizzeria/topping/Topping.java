package it.epicode.menu_pizzeria.topping;

import it.epicode.menu_pizzeria.menu.RigaMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping implements RigaMenu {

    private String name;
    private String description;
    private double price;
    private int calories;

    @Override
    public String descrizioneRiga() {
        return name + " - " + description + " - " + price + " € " + calories + " kcal";
    }
}
