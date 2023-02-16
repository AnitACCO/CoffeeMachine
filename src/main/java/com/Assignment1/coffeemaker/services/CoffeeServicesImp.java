package com.Assignment1.coffeemaker.services;

import com.Assignment1.coffeemaker.exception.coffeeException;
import com.Assignment1.coffeemaker.model.CoffeeMachine;
import com.Assignment1.coffeemaker.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CoffeeServicesImp implements CoffeeServices{

    @Autowired
    private CoffeeRepository coffeeRepository;

    @Override
    public CoffeeMachine getCoffeeByName(String S) {
        Optional<CoffeeMachine> cmObj = this.coffeeRepository.findById(S);
        if(cmObj.isPresent()){
            return cmObj.get();
        }
        else {
           throw new coffeeException("No Coffee with name "+ S);
        }
    }

    @Override
    public List<CoffeeMachine> getAllProduct() {
        return this.coffeeRepository.findAll();
    }
}
