package com.Assignment1.coffeemaker.controller;

import com.Assignment1.coffeemaker.model.CoffeeMachine;
import com.Assignment1.coffeemaker.services.CoffeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeController {
    @Autowired
    private CoffeeServices coffeeServices;

    @GetMapping("/coffee")
    private ResponseEntity<List<CoffeeMachine>> getAllProduct(){
        return ResponseEntity.ok().body(this.coffeeServices.getAllProduct());
    }

    @GetMapping("/coffee/{coffeetype}")
    private CoffeeMachine getCoffeebyName(@PathVariable String coffeetype){
        return this.coffeeServices.getCoffeeByName(coffeetype);
    }
}
