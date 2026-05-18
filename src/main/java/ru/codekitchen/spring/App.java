package ru.codekitchen.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.codekitchen.spring");
        Vehicle vehicle = context.getBean("bike", Vehicle.class);
        vehicle.startEngine();
        context.close();
    }
}
