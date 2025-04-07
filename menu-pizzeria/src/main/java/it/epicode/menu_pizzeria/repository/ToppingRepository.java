package it.epicode.menu_pizzeria.repository;

import it.epicode.menu_pizzeria.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
