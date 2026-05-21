package ru.codekitchen.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    public Cat() {
        System.out.println("Cat bean is  created");
    }
    public String getName(){
        return "Boris";
    }
}
