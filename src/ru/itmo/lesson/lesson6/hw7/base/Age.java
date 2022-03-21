package ru.itmo.lesson.lesson6.hw7.base;

import ru.itmo.lesson.lesson6.hw7.base.Name;

abstract public class Age extends Name {
    protected int agePeople;

    public Age (String name, int agePeople){
        super(name); // вызов конструктора родителя

        if (agePeople > 7){
            throw new IllegalArgumentException("Возраст дб больше 7 лет: ");
        }
        this.agePeople = agePeople;
    }

    public int getAgePeople() {
        return agePeople;
    }

    public void setAgePeople(int agePeople) {
        if (agePeople >7)
        this.agePeople = agePeople;
    }
}
