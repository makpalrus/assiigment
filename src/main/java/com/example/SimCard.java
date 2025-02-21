package com.example;

import org.springframework.stereotype.Component;

@Component
public class SimCard {
    private String operator = "Beeline";
    private String number = "+7 777 398 0496";

    @Override
    public String toString() {
        return "СИМ-карта: " + operator + ", номер: " + number;
    }
}
