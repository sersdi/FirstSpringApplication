package ru.codekitchen.spring;

import org.springframework.stereotype.Component;

@Component("bike")
public class Motorbike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorbike engine started.");
    }
}
