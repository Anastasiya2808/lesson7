package ru.itmo.lesson.lesson6.hw7;

import ru.itmo.lesson.lesson6.hw7.base.Age;

public class Student extends Age {
    private String subject;
    private int knowleges;

    public Student (int agePeople, String name){
        super(name, agePeople);
        if (subject == null){
            throw new IllegalArgumentException("Предмет должен содержать символы");
        }
        this.subject = getSubject();
    }

    public String getSubject() {
        return subject;
    }
    public Student (String name, String subject){
        super(name,String subject);
    }
    public void gainknowledge (int navik){
        knowleges += (int) (Math.random()*navik);
        System.out.println("Уровень знаний ученика " + knowleges);
    }
}
