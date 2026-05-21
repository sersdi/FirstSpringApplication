package ru.codekitchen.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.codekitchen.spring")    //если написать без аргументов, то просканируется пакет в котором находится класс и все его подпакеты
@PropertySource("application.properties")
public class ApplicationConfiguration {
}
