package it.epicode.menu_pizzeria.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pizze")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "description", nullable = false)
    private String description;
    private boolean XL;
    @Column (name = "price", nullable = false)
    private double price;
    @Column (name = "calories", nullable = false)
    private double calories;

    public Pizza() {
    }

    public Pizza(Long id, String name, String description, boolean XL, double price, double calories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.XL = XL;
        this.price = price;
        this.calories = calories;
    }
}
