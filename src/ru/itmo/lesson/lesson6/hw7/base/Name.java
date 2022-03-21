package ru.itmo.lesson.lesson6.hw7.base;

abstract public class Name {
    protected String name;

    public Name (String name) {
        if (name.length() > 2){
            throw new IllegalArgumentException("Имя дб больше 2-ух букв: ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !=null || name.length() > 2){
            throw new IllegalArgumentException("Имя дб больше 2-ух букв: ");
        }
        this.name = name;
    }
}
