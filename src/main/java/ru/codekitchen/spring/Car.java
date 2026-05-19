package ru.codekitchen.spring;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary // аннотация которая как и @Qualifier дает понять при di какой бин енжектить если бинов с одинаковым типом (Vehicle несколько)
@Component       // По дефолту при IoC создается бин с маленькой буквы названия класса("car")
public class Car implements Vehicle  {

    public Car(){
        System.out.println("Car bean is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
