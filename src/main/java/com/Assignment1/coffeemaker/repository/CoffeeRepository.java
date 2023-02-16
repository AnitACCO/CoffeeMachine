package com.Assignment1.coffeemaker.repository;

import com.Assignment1.coffeemaker.model.CoffeeMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<CoffeeMachine, String> {
}
