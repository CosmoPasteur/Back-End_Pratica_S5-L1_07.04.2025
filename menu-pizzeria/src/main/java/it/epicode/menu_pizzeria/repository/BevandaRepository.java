package it.epicode.menu_pizzeria.repository;

import it.epicode.menu_pizzeria.bevanda.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepository extends JpaRepository<Bevanda, Long> {
}
