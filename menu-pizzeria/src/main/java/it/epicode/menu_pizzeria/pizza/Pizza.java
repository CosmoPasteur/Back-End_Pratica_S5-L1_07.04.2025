package it.epicode.menu_pizzeria.pizza;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pizzas")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "description", nullable = false)
    private String description;
    @Column (name = "price", nullable = false)
    private double price;
    @Column (name = "calories", nullable = false)
    private double calories;

}
