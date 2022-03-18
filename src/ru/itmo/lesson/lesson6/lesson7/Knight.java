package ru.itmo.lesson.lesson6.lesson7;

//Рыцари
//здоровье
// очкиАтаки
// долполнительноеЗдоровье

import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;

public class Knight extends BattleUnit { // унаследовал все кроме конструктора
    private int additionalHealth = 10;

    public Knight(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void knightUnitVoid() {
        System.out.println("Mетод KnightUnitVoid");
    }
}