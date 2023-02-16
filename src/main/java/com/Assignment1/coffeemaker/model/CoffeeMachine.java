package com.Assignment1.coffeemaker.model;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

@Entity
@Table(name = "coffeemech")
public class CoffeeMachine {
    @Id
    private String coffeetype;

    @Column(name = "milkVolume")
    private int milkVolume;

    @Column(name = "waterVolume")
    private int waterVolume;

    @Column(name = "coffeeWeigth")
    private int coffeeWeigth;

    @Column(name = "steamPressure")
    private int steamPressure;

    public String getCoffeetype() {
        return coffeetype;
    }

    public void setCoffeetype(String coffeetype) {
        this.coffeetype = coffeetype;
    }

    public int getMilkVolume() {
        return milkVolume;
    }

    public void setMilkVolume(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    public int getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    public int getCoffeeWeigth() {
        return coffeeWeigth;
    }

    public void setCoffeeWeigth(int coffeeWeigth) {
        this.coffeeWeigth = coffeeWeigth;
    }

    public int getSteamPressure() {
        return steamPressure;
    }

    public void setSteamPressure(int steamPressure) {
        this.steamPressure = steamPressure;
    }


}
