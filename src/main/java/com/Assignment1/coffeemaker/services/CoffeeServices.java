package com.Assignment1.coffeemaker.services;

import com.Assignment1.coffeemaker.model.CoffeeMachine;

import java.util.List;

public interface CoffeeServices {
    CoffeeMachine getCoffeeByName(String S);
    List<CoffeeMachine> getAllProduct();

}
