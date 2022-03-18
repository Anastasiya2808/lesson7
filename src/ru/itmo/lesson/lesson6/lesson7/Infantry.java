package ru.itmo.lesson.lesson6.lesson7;

//Пехотинец
// здоровье
// очкиАтаки
// дополнительнаяАтака

import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void infantryUnitVoid() {
        System.out.println("Mетод InfantryUnitVoid");
    }
}