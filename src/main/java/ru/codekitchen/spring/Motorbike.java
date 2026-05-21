package ru.codekitchen.spring;

//import org.springframework.stereotype.Component;

//@Component("bike")
public class Motorbike implements Vehicle {

    public Motorbike() {
        System.out.println("Bean motorbike is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike engine started.");
    }

//    @Override
//    public String toString() {
//        return "Motorbike";
//    }
}
