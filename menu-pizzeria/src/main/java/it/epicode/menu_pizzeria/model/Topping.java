package it.epicode.menu_pizzeria.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "toppings")
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "price", nullable = false)
    private double price;
    @Column (name = "calories", nullable = false)
    private double calories;
}
