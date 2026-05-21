package ru.codekitchen.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.codekitchen.spring.Dog;

@Configuration
public class PetConfiguration {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
