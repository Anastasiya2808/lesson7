package ru.itmo.lesson.lesson6.lesson7;

//Пехотинец
// здоровье
// очкиАтаки
// дополнительнаяАтака

import ru.itmo.lesson.lesson6.lesson7.base.AttackAble;
import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;

public class Infantry extends BattleUnit implements AttackAble {
    // final свойство нельзя изменить
    // значение можно задать только при объявлении
    // или через конструктор, но не в сеттерах и тп
    private final int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void infantryVoid() {
        System.out.println("Mетод InfantryVoid");
    }

    // перераспределение метода родителя
    @Override
    public boolean runFromField(){
        if (super.runFromField()){ // обращение к родителю
            attackScore -= 3;
            System.out.println("После бегства атака уменьшилась на 3");
            return true;
        }
        return false;

        // если юнит выжил,
        // attackScore уменьшится на 3
        // можно написать собственную реализацию, которая перекроет реализацию родителя

    }

    @Override
    public void rest() {
        plusHealth(1);
        System.out.println("отдых пехотинца");
    }
    @Override
    public void attack(BattleUnit emeny){
        if (emeny.isAlive() && this.isAlive())emeny.minusHealth(attackScore);
        if (emeny.isAlive()) this.minusHealth(emeny.getAttackScore());
        if (this.isAlive()) emeny.minusHealth(additionalAttack);
    }

}