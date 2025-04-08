package it.epicode.menu_pizzeria.bevanda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {
//I Bean sono delle funzioni che configurano delle classi.

    @Bean
    public Bevanda cocaCola() {
        return new Bevanda("Coca Cola", "Beverage", 1.5, 120);
    }

    @Bean
    public Bevanda fanta() {
        return new Bevanda("Fanta", "Beverage", 1.5, 120);
    }

    @Bean
    public Bevanda sprite() {
        return new Bevanda("Sprite", "Beverage", 1.5, 120);
    }

}
