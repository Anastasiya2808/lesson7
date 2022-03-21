package ru.itmo.lesson.lesson6.lesson7;

//Рыцари
//здоровье
// очкиАтаки
// долполнительноеЗдоровье

import ru.itmo.lesson.lesson6.lesson7.base.AttackAble;
import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;

// класс Knight реализует (имплементирует) интерфейс  AttackAble
// можно реализовать несколько интерфейсов implements Int1, implements Int2....
public final class Knight extends BattleUnit { // унаследовал все кроме конструктора
    private final int additionalHealth = 10;

    public Knight(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void knightUnitVoid() {
        System.out.println("Mетод KnightUnitVoid");
    }

    @Override
    public void rest() {
        plusHealth(3);
        System.out.println("Отдых рыцаря");
    }

    @Override
    public void attack (BattleUnit emeny){
       if (emeny.isAlive() && this.isAlive()) emeny.minusHealth(attackScore);
       if (emeny.isAlive()) this.minusHealth(emeny.getAttackScore());
       if (this.isAlive()) this.plusHealth((int) (Math.random()* additionalHealth));
    }


}