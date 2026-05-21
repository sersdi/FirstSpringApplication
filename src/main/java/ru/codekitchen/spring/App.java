package ru.codekitchen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import ru.codekitchen.spring.config.PetConfiguration;
//import ru.codekitchen.spring.config.VehicleConfiguration;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        DataBaseConnector connector = context.getBean("dataBaseConnector",DataBaseConnector.class);
        connector.executeSql("select * from person");


//        Person person = context.getBean(Person.class);
//        person.startVehicleEngine();
//        person.callPet();
//        context.close();


//        Vehicle vehicle1 = context.getBean("car", Vehicle.class);
//        Vehicle vehicle2 = context.getBean("car", Vehicle.class);
//        System.out.println("vehicle == vehicle2? Answer: "+ (vehicle1 == vehicle2));
//        System.out.println("vehicle memory address: " + vehicle1);
//        System.out.println("vehicle memory address: " + vehicle2);
//        context.close();

//        DataBaseConnector connector1 = DataBaseConnector.getInstance();
//        DataBaseConnector connector2 = DataBaseConnector.getInstance();
//        System.out.println("connector1 == connector2? Answer: "+ (connector1 == connector2));
//        System.out.println("connector1 memory address: " + connector1);
//        System.out.println("connector2 memory address: " + connector2);
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
