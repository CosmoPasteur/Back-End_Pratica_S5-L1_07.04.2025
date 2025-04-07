package it.epicode.menu_pizzeria.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bevande")
public class Bevanda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "price", nullable = false)
    private double price;
    @Column (name = "calories", nullable = false)
    private double calories;

    public Bevanda() {
    }

    public Bevanda(Long id, String name, double price, double calories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
