package ru.itmo.lesson.lesson6.hw7;

import ru.itmo.lesson.lesson6.hw7.base.Age;

public class Director extends Age {
    public Director (String name){
        super(name);
    }
    public Director (int Age){
        super(Age);
    }
    public void start(){
        System.out.println("Начало занятий");
    }
    public void end (){
        System.out.println("Конец занятий");
    }
}
