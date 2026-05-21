package ru.codekitchen.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.codekitchen.spring.*;

@Configuration                          // вспомогательный класс, где будут аннотации @bean
public class VehicleConfiguration {
    @Bean                               //помечаем методы, где создаем объект, что бы спринг контейнер создал по нему бин(название бина как у метода)
    public Motorbike  motorbike(){
        return new Motorbike();
    }
    @Bean
    public Car car(){
        return new Car();
    }
    @Bean
    public Person person(@Qualifier("car") Vehicle vehicle, Dog dog){
        return new Person(vehicle, dog);
    }

}
