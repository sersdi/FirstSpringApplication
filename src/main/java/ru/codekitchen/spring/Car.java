package ru.codekitchen.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle  {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}
