package com.example;

import org.springframework.stereotype.Component;

@Component
public class Owner {
    private String name = "Makpal";
    private int age = 18;

    @Override
    public String toString() {
        return "Владелец: " + name + ", возраст: " + age;
    }
}
