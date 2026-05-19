package ru.codekitchen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.codekitchen.spring");
        Vehicle vehicle1 = context.getBean("car", Vehicle.class);
        Vehicle vehicle2 = context.getBean("car", Vehicle.class);
        System.out.println("vehicle == vehicle2? Answer: "+ (vehicle1 == vehicle2));
        System.out.println("vehicle memory address: " + vehicle1);
        System.out.println("vehicle memory address: " + vehicle2);
        context.close();

        DataBaseConnector connector1 = DataBaseConnector.getInstance();
        DataBaseConnector connector2 = DataBaseConnector.getInstance();

//        connector1.executeSql("SELECT * FROM students");


//        Person person = context.getBean("person", Person.class);
//        person.startVehicleEngine();
//
//        Parking parking = context.getBean("parking", Parking.class);
//        System.out.println(parking.getVehiclesList());
//        System.out.println(parking.getVehiclesMap());
//        System.out.println(parking);
    }
}
