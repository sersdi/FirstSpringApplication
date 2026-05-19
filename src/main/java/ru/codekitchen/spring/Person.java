package ru.codekitchen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component                      // IoC
public class Person {
    //@Autowired //внедрение зависимости (DI через поле)
    private Vehicle vehicle;

    @Autowired // Внедрение зависимостей (DI через конструктор), рекомендуется внедрять через конструктор
    public Person(@Qualifier("car") Vehicle vehicle) {    // Если у бина только один конструктор, то @Autowired можно не указывать
        this.vehicle = vehicle;                           // Аннотация @Qualifier подсказывает какой именно бин будем инжектить(тк бинов типа Vehicle несколько)
        System.out.println("Person bean is created");
    }

//    @Autowired                // Внедрение зависимости через сеттер (DI)
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Person bean: vehicle set");
//    }

    public void startVehicleEngine(){
        System.out.println("Person is starting engine...");
        vehicle.startEngine();
    }



}
