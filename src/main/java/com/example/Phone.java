package com.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private final SimCard simCard;
    private final Owner owner;
    private final String model = "Iphone 13";

    public Phone(SimCard simCard, Owner owner) {
        this.simCard = simCard;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Телефон: " + model + ", " + simCard + ", " + owner;
    }
}
