package ru.itmo.lesson.lesson6.hw7;

import ru.itmo.lesson.lesson6.hw7.base.Age;

public class Teacher extends Age {
    public int navik;
    public Teacher (String name, String subject, int navik){
        super(name,Student subject);
        this.navik = navik;
    }
    public void teaching (Student student){
        student.gainknowledge(navik);
        System.out.println("Учитель преподает" + navik);
    }
}
