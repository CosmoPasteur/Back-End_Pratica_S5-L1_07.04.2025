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
}
